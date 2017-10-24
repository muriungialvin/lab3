package alvin.aclass.com.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler db = new DatabaseHandler(this);
            /**
             * CRUD Operations
             */


        //Inserting Cars
        Log.d("insert: ", "Inserting..");
        db.addCars(new Cars(" BMW", "320I"));
        db.addCars(new Cars(" TOYOTA", "COROLLA"));
        db.addCars(new Cars(" MERCEDES", "S500"));
        db.addCars(new Cars(" NISSAN", "GTR"));


        //Inserting Contacts
        Log.d("insert: ", "Inserting..");
        db.addContact(new Contact(" Ravi", "910000000000"));
        db.addContact(new Contact(" srinivas", "91999999999"));
        db.addContact(new Contact(" Tommy", "95222222222"));
        db.addContact(new Contact(" Karthik", "953333333333"));

        //Reading all contacts
        Log.d("Reading: ", "Reading all contacts...");
        List<Contact> contact = db.getAllContacts();

        for (Contact en : contact) {
            String log = "Id: "+en.getID()+" ,Name: " + en.getName() + " , Phone: " + en.getPhoneNumber();
            //Writing Contacts to log
            Log.d("Name: ", log);
        }

        //Reading all CARS
        Log.d("Reading: ", "Reading all cars...");
        List<Cars> cars = db.getAllCars();

        for (Cars en : cars) {
            String log = "Id: "+en.getID()+" ,Make: " + en.getMake() + " , Model: " + en.getModel();
            //Writing Contacts to log
            Log.d("Name: ", log);
        }

    }
}