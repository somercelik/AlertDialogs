package com.somercelik.alertdialogs;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /*Yapılacak işlemin başlatılması aşamasında
     * kullanıcıdan devam etmek isteyip istemediği-
     * ne dair onay alınmak istenen durumlarda kul-
     * lanılacak AlertDialog örneğidir.
     * created by @somercelik*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void save(View view) {                                                                   //onClick metodu
        AlertDialog.Builder alert = new AlertDialog.Builder(this);                          //AlertDialog nesnesi oluşturulur.
        alert.setTitle("Save");                                                                     //Başlık "Save" şeklinde ayarlanır.
        alert.setMessage("Are you sure?");                                                          //Alttaki mesaj ayarlanır.
        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {                 //Onaylayan giriş ayarlanır. -POZİTİF
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {                           //Onaylandığında gösterilecek Toast Message
                Toast.makeText(MainActivity.this, "Saved.", Toast.LENGTH_LONG).show(); //içeriği belirtilir.
            }
        });
        alert.setNegativeButton("No", new DialogInterface.OnClickListener() {                  //Onaylanmayan giriş. -NEGATİF
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {                           //Onaylanmadığında gösterilecek Toast Message
                Toast.makeText(MainActivity.this, "Not saved.", Toast.LENGTH_LONG).show();//içeriği girilir.
            }
        });
        alert.show();                                                                               //Set işlemlerinin ardından alerDialog ekranda gösterilir.
    }
}