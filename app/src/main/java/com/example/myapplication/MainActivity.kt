import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener

class MainActivity : AppCompatActivity() {
    private var tabLayout: TabLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tabLayout = findViewById<TabLayout>(R.id.tabLayout)

        tabLayout?.addOnTabSelectedListener(object : OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                val position = tab.position
                when (position) {
                    0 ->                         // Geçmiş İlanlar Tab'ı seçildiğinde yapılacak işlemler
                        showToast("Geçmiş İlanlar seçildi")

                    1 ->                         // Aktif İlanlar Tab'ı seçildiğinde yapılacak işlemler
                        showToast("Aktif İlanlar seçildi")

                    2 ->                         // Bekleyen İlanlar Tab'ı seçildiğinde yapılacak işlemler
                        showToast("Bekleyen İlanlar seçildi")
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {
                // Implement if needed
            }

            override fun onTabReselected(tab: TabLayout.Tab) {
                // Implement if needed
            }
        })
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
