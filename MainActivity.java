package com.randomfood.www.final_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    String [] ff_spicy_choice = new String[10];
    String [] ff_savory_choice = new String[10];
    String [] r_spicy_choice = new String[10];
    String [] r_savory_choice = new String[10];
    String [] hc_spicy_choice = new String[10];
    String [] hc_savory_choice = new String[10];
    String favorite_food_type;
    int i;
    int ff = 0;
    int r = 0;
    int hc = 0;
    Random rand = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = (Button) this.findViewById(R.id.randomize);
        b.setOnClickListener(this);
    }

    public void onClick(View v)
    {
        EditText e = (EditText)MainActivity.this.findViewById(R.id.FavoriteFood);
        favorite_food_type = e.getText().toString();
        init();
       //Intent intent = new Intent(this, FoodChoice.class);
       //intent.putExtra("Food");
       //startActivity(intent);
    }

    public void init()
    {
        int number = rand.nextInt(3);

        if(number == 0)
        {
            for (i = 0; i < 10; i++) {
                ff_spicy_choice[i] = get_spicy_fast_food();
                System.out.println(ff_spicy_choice[i]);
                //System.out.println(favorite_food_type);
            }//for
            ff = 0;
            for (i = 0; i < 10; i++) {
                ff_savory_choice[i] = get_savory_fast_food();
                System.out.println(ff_savory_choice[i]);
                //System.out.println(favorite_food_type);
            }//for
            ff = 0;
        }//if

        if(number == 1)
        {
            for (i = 0; i < 10; i++) {
                r_spicy_choice[i] = get_spicy_restaurant();
                System.out.println(r_spicy_choice[i]);
                //System.out.println(favorite_food_type);
            }//for
            r = 0;
            for (i = 0; i < 10; i++) {
                r_savory_choice[i] = get_savory_restaurant();
                System.out.println(r_savory_choice[i]);
                //System.out.println(favorite_food_type);
            }//for
            r = 0;

        }//if

        if(number == 2)
        {
            System.out.println("Home");
            /*
            for (i = 0; i < 10; i++) {
                ff_spicy_choice[i] = get_spicy_fast_food();
                System.out.println(ff_spicy_choice[i]);
                //System.out.println(favorite_food_type);
            }//for
            ff = 0;
            for (i = 0; i < 10; i++) {
                ff_savory_choice[i] = get_savory_fast_food();
                System.out.println(ff_savory_choice[i]);
                //System.out.println(favorite_food_type);
            }//for
            ff = 0;
            */
        }//if

    }//init

    public String get_spicy_fast_food()
    {
        while(ff < 10 && favorite_food_type.equals("Spicy"))
        {
            if (ff == 0)
            {
                ff++;
                return "Spicy Burrito";
            }
            if (ff == 1)
            {
                ff++;
                return "Spicy Chicken";
            }
            if (ff == 2)
            {
                ff++;
                return "Spicy Taco";
            }
            if (ff == 3)
            {
                ff++;
                return "Spicy Beef";
            }
            if (ff == 4)
            {
                ff++;
                return "Spicy Pasta";
            }
            if (ff == 5)
            {
                ff++;
                return "Spicy Salad";
            }
            if (ff == 6)
            {
                ff++;
                return "Spicy Fish";
            }
            if (ff == 7)
            {
                ff++;
                return "Spicy Soup";
            }
            if (ff == 8)
            {
                ff++;
                return "Spicy Stuff";
            }
            if (ff == 9)
            {
                ff++;
                return "Spicy Spice";
            }
        }

        ff++;
        return "";
    }

    public String get_savory_fast_food()
    {
        while(ff < 10 && favorite_food_type.equals("Savory"))
        {
            if (ff == 0)
            {
                ff++;
                return "Burger";
            }
            if (ff == 1)
            {
                ff++;
                return "Hot Dog";
            }
            if (ff == 2)
            {
                ff++;
                return "Chicken Strips";
            }
            if (ff == 3)
            {
                ff++;
                return "Breakfast Sandwich";
            }
            if (ff == 4)
            {
                ff++;
                return "Turkey Sandwich";
            }
            if (ff == 5)
            {
                ff++;
                return "Ham Sandwhich";
            }
            if (ff == 6)
            {
                ff++;
                return "Fish Sandwich";
            }
            if (ff == 7)
            {
                ff++;
                return "Grilled Cheese";
            }
            if (ff == 8)
            {
                ff++;
                return "Fish and Chips";
            }
            if (ff == 9)
            {
                ff++;
                return "Chicken";
            }
        }
        ff++;
        return "";
    }

    public String get_spicy_restaurant()
    {
        while(r < 10 && favorite_food_type.equals("Spicy"))
        {
            if (r == 0)
            {
                r++;
                return "Spicy Chicken with White Rice";
            }
            if (r == 1)
            {
                r++;
                return "Spicy Chicken Enchilada with Black Beans and Rice";
            }
            if (r == 2)
            {
                r++;
                return "Spicy Sausage with Tomato Sauce";
            }
            if (r == 3)
            {
                r++;
                return "Spicy Fish with Tartar Sauce";
            }
            if (r == 4)
            {
                r++;
                return "Linguine with Spicy Shrimp";
            }
            if (r == 5)
            {
                r++;
                return "Chili with Cornbread";
            }
            if (r == 6)
            {
                r++;
                return "Spicy Sausage Soup with Chopped Kale";
            }
            if (r == 7)
            {
                r++;
                return "Spicy Soup";
            }
            if (r == 8)
            {
                r++;
                return "Spicy Stuff";
            }
            if (r == 9)
            {
                r++;
                return "Spicy Spice";
            }
        }

        r++;
        return "";
    }

    public String get_savory_restaurant()
    {
        while(r < 10 && favorite_food_type.equals("Savory"))
        {
            if (r == 0)
            {
                r++;
                return "Steak and Onions";
            }
            if (r == 1)
            {
                r++;
                return "Surf n' Turf";
            }
            if (r == 2)
            {
                r++;
                return "Clam Chowder with Garlic Bread";
            }
            if (r == 3)
            {
                r++;
                return "Chicken Fettuccine Alfredo";
            }
            if (r == 4)
            {
                r++;
                return "Chicken Lettuce Wrap";
            }
            if (r == 5)
            {
                r++;
                return "Baked Chicken with Quinoa";
            }
            if (r == 6)
            {
                r++;
                return "Baked Tilapia with Boiled Spinach";
            }
            if (r == 7)
            {
                r++;
                return "";
            }
            if (r == 8)
            {
                r++;
                return "";
            }
            if (r == 9)
            {
                r++;
                return "";
            }
        }
        r++;
        return "";
    }



}
