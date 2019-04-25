package cz.czechitas.janhanak.czechitas6gson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static String data = "[{\"name\":\"b\",\"image\":\"d\",\"description\":\"f\"},{\"name\":\"b\",\"image\":\"d\",\"description\":\"f\"},{\"name\":\"b\",\"image\":\"d\",\"description\":\"f\"}]";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Type listMovies = new TypeToken<ArrayList<Movie>>() {}.getType();
        ArrayList<Movie> movies = new Gson().fromJson(data, listMovies);

        Toast.makeText(this, movies.toString(), Toast.LENGTH_SHORT).show();
    }
}
