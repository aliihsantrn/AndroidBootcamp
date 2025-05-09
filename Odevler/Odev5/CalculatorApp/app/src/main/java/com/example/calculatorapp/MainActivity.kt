package com.example.calculatorapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calculatorapp.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder
import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.Locale

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var expression = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupNumberButtons()
        setupActionButtons()
    }

    private fun setupNumberButtons() = with(binding) {
        val numberButtons = listOf(
            button0, button1, button2, button3, button4,
            button5, button6, button7, button8, button9,
            buttonDot, doubleZeroBtn
        )

        for (button in numberButtons) {
            button.setOnClickListener {
                expression += button.text
                resultTextView.setText(expression)
            }
        }
    }

    private fun setupActionButtons() = with(binding) {
        clearBtn.setOnClickListener {
            expression = ""
            resultTextView.setText("0")
        }

        backspaceBtn.setOnClickListener {
            if (expression.isNotEmpty()) {
                expression = expression.dropLast(1)
                resultTextView.setText(if (expression.isNotEmpty()) expression else "0")
            }
        }

        button0.setOnClickListener {
            // Eğer resultTextView'de "0" yazıyorsa, ekleme yapma
            if (binding.resultTextView.text.toString() == "0") {
                // Hiçbir şey yapma, kullanıcı 0 ekleyemez
                return@setOnClickListener
            } else {
                // Eğer farklı bir sayı varsa, 0 ekleyebilirsin
                expression += "0"
                binding.resultTextView.setText(expression)
            }
        }

        percentBtn.setOnClickListener {
            expression += "%"
            resultTextView.setText(expression)
        }

        binding.DivideBtn.setOnClickListener { appendOperator("/") }
        multiplyBtn.setOnClickListener { appendOperator("*") }
        binding.SubstractBtn.setOnClickListener { appendOperator("-") }
        addBtn.setOnClickListener { appendOperator("+") }

        equalsBtn.setOnClickListener {
            calculateResult()
        }
    }

    private fun appendOperator(op: String) {
        if (expression.isNotEmpty() && !isLastCharOperator()) {
            expression += op
            binding.resultTextView.setText(expression)
        }
    }

    private fun isLastCharOperator(): Boolean {
        return expression.lastOrNull()?.let { "+-*/%".contains(it) } ?: false
    }

    private fun calculateResult() {
        try {
            val result = ExpressionBuilder(expression).build().evaluate()

            val formattedResult = if (result % 1 == 0.0) {
                result.toInt().toString()
            } else {
                result.toString()
            }

            binding.resultTextView.setText(formattedResult)
            expression = formattedResult
        } catch (e: Exception) {
            binding.resultTextView.setText("Error")
        }
    }

}