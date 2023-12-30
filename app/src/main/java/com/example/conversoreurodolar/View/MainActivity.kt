import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.conversoreurodolar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val converterModel = ConverterModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonConverter.setOnClickListener {
            val euros = binding.editEuro.text.toString().toDouble()
            val dollars = converterModel.convertEuroToDollar(euros)
            val formattedDollars = String.format("%.2f", dollars)
            binding.textDolares.text = "$formattedDollars $"
        }
    }
}
