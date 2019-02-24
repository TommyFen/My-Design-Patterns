package tommy.mydesignpatterns;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import tommy.mydesignpatterns.b_decorator.StarbuzzCoffee;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StarbuzzCoffee.orderEspresso();
        StarbuzzCoffee.orderDarkRoast();
        StarbuzzCoffee.orderDecaf();
        StarbuzzCoffee.orderHouseBlend();

    }
}
