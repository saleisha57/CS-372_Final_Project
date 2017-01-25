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
    String [] ff_sweet_choice = new String[10];
    String [] r_spicy_choice = new String[10];
    String [] r_savory_choice = new String[10];
    String [] r_sweet_choice = new String[10];
    String [] hc_spicy_choice = new String[10];
    String [] hc_savory_choice = new String[10];
    String [] hc_sweet_choice = new String[10];
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
    }

    public void init()
    {
        int number = rand.nextInt(3);
        int number_2 = rand.nextInt(10);

        if(number == 0)
        {
            for (i = 0; i < 10; i++)
            {
                ff_spicy_choice[i] = get_spicy_fast_food();
            }//for
            ff = 0;
            for (i = 0; i < 10; i++) {
                ff_savory_choice[i] = get_savory_fast_food();
            }//for
            ff = 0;
            for (i = 0; i < 10; i++) {
                ff_sweet_choice[i] = get_sweet_fast_food();
            }//for

            for(i = 0; i < 10; i ++)
                if(number == 0 && number_2 == i && favorite_food_type.equals("Savory"))
                {
                    Intent intent = new Intent(this, DisplayActivity.class);
                    intent.putExtra("Display", ff_savory_choice[i]);
                    startActivity(intent);
                }

            for(i = 0; i < 10; i ++)
                if(number == 0 && number_2 == i && favorite_food_type.equals("Spicy"))
                {
                    Intent intent = new Intent(this, DisplayActivity.class);
                    intent.putExtra("Display", ff_spicy_choice[i]);
                    startActivity(intent);
                }

            for(i = 0; i < 10; i ++)
                if(number == 0 && number_2 == i && favorite_food_type.equals("Sweet"))
                {
                    Intent intent = new Intent(this, DisplayActivity.class);
                    intent.putExtra("Display", ff_sweet_choice[i]);
                    startActivity(intent);
                }

            ff = 0;
        }//if

        if(number == 1)
        {
            for (i = 0; i < 10; i++) {
                r_spicy_choice[i] = get_spicy_restaurant();
            }//for
            r = 0;
            for (i = 0; i < 10; i++) {
                r_savory_choice[i] = get_savory_restaurant();
            }//for
            r = 0;
            for (i = 0; i < 10; i++) {
                r_sweet_choice[i] = get_sweet_restaurant();
            }//for

            for(i = 0; i < 10; i ++)
                if(number == 1 && number_2 == i && favorite_food_type.equals("Savory"))
                {
                    Intent intent = new Intent(this, DisplayActivity.class);
                    intent.putExtra("Display", r_savory_choice[i]);
                    startActivity(intent);
                }

            for(i = 0; i < 10; i ++)
                if(number == 1 && number_2 == i && favorite_food_type.equals("Spicy"))
                {
                    Intent intent = new Intent(this, DisplayActivity.class);
                    intent.putExtra("Display", r_spicy_choice[i]);
                    startActivity(intent);
                }

            for(i = 0; i < 10; i ++)
                if(number == 1 && number_2 == i && favorite_food_type.equals("Sweet"))
                {
                    Intent intent = new Intent(this, DisplayActivity.class);
                    intent.putExtra("Display", r_sweet_choice[i]);
                    startActivity(intent);
                }
            r = 0;

        }//if

        if(number == 2)
        {
            for (i = 0; i < 10; i++) {
                hc_spicy_choice[i] = get_spicy_home();
            }//for
            hc = 0;
            for (i = 0; i < 10; i++) {
                hc_savory_choice[i] = get_savory_home();
            }//for
            hc = 0;
            for (i = 0; i < 10; i++) {
                hc_sweet_choice[i] = get_sweet_home();
            }//for

            for (i = 0; i < 10; i++)
                if (number == 2 && number_2 == i && favorite_food_type.equals("Savory"))
                {
                    Intent intent = new Intent(this, DisplayActivity.class);
                    intent.putExtra("Display", hc_savory_choice[i]);
                    startActivity(intent);
                }

            for (i = 0; i < 10; i++)
                if (number == 2 && number_2 == i && favorite_food_type.equals("Spicy"))
                {
                    Intent intent = new Intent(this, DisplayActivity.class);
                    intent.putExtra("Display", hc_spicy_choice[i]);
                    startActivity(intent);
                }

            for (i = 0; i < 10; i++)
                if (number == 2 && number_2 == i && favorite_food_type.equals("Sweet"))
                {
                    Intent intent = new Intent(this, DisplayActivity.class);
                    intent.putExtra("Display", hc_sweet_choice[i]);
                    startActivity(intent);
                }
            hc = 0;
        }//if

    }//init

    public String get_spicy_fast_food()
    {
        while(ff < 10 && favorite_food_type.equals("Spicy"))
        {
            if (ff == 0)
            {
                ff++;
                return "Fast Food:  Spicy Burrito";
            }
            if (ff == 1)
            {
                ff++;
                return "fast Food:  Spicy Chicken";
            }
            if (ff == 2)
            {
                ff++;
                return "Fast Food:  Spicy Taco";
            }
            if (ff == 3)
            {
                ff++;
                return "Fast Food:  Spicy Beef";
            }
            if (ff == 4)
            {
                ff++;
                return "Fast Food:  Spicy Burger";
            }
            if (ff == 5)
            {
                ff++;
                return "Fast Food:  Salad with Spicy Sauce";
            }
            if (ff == 6)
            {
                ff++;
                return "Fast Food:  Spicy Fish Sandwich";
            }
            if (ff == 7)
            {
                ff++;
                return "Fast Food:  Spicy Meat Soup";
            }
            if (ff == 8)
            {
                ff++;
                return "Fast Food:  Spicy Chicken Sandwich";
            }
            if (ff == 9)
            {
                ff++;
                return "Fast Food:  Spicy Chicken Wings";
            }
        }//while
        ff++;
        return "";
    }//fast_food_spicy

    public String get_savory_fast_food()
    {
        while(ff < 10 && favorite_food_type.equals("Savory"))
        {
            if (ff == 0)
            {
                ff++;
                return "Fast Food:  Burger";
            }
            if (ff == 1)
            {
                ff++;
                return "Fast Food:  Hot Dog";
            }
            if (ff == 2)
            {
                ff++;
                return "Fast Food:  Chicken Strips";
            }
            if (ff == 3)
            {
                ff++;
                return "Fast Food:  Breakfast Sandwich";
            }
            if (ff == 4)
            {
                ff++;
                return "Fast Food:  Turkey Sandwich";
            }
            if (ff == 5)
            {
                ff++;
                return "Fast Food:  Ham Sandwich";
            }
            if (ff == 6)
            {
                ff++;
                return "Fast Food:  Fish Sandwich";
            }
            if (ff == 7)
            {
                ff++;
                return "Fast Food:  Grilled Cheese";
            }
            if (ff == 8)
            {
                ff++;
                return "Fast Food:  Fish and Chips";
            }
            if (ff == 9)
            {
                ff++;
                return "Fast Food:  Chicken Caesar Salad";
            }
        }//while
        ff++;
        return "";
    }//fast_food_savory

    public String get_sweet_fast_food()
    {
        while(ff < 10 && favorite_food_type.equals("Sweet"))
        {
            if (ff == 0)
            {
                ff++;
                return "Fast Food:  Chocolate or Vanilla Milkshake";
            }
            if (ff == 1)
            {
                ff++;
                return "Fast Food:  Miniature Apple Pie";
            }
            if (ff == 2)
            {
                ff++;
                return "Fast Food:  Chicken Strips";
            }
            if (ff == 3)
            {
                ff++;
                return "Fast Food:  Breakfast Sandwich";
            }
            if (ff == 4)
            {
                ff++;
                return "Fast Food:  Turkey Sandwich";
            }
            if (ff == 5)
            {
                ff++;
                return "Fast Food:  Ham Sandwich";
            }
            if (ff == 6)
            {
                ff++;
                return "Fast Food:  Fish Sandwich";
            }
            if (ff == 7)
            {
                ff++;
                return "Fast Food:  Grilled Cheese";
            }
            if (ff == 8)
            {
                ff++;
                return "Fast Food:  Fish and Chips";
            }
            if (ff == 9)
            {
                ff++;
                return "Fast Food:  Chicken Caesar Salad";
            }
        }//while
        ff++;
        return "";
    }//fast_food_sweet


    // RESTAURANT!!!

    public String get_spicy_restaurant()
    {
        while(r < 10 && favorite_food_type.equals("Spicy"))
        {
            if (r == 0)
            {
                r++;
                return "Restaurant:  Spicy Chicken with White Rice";
            }
            if (r == 1)
            {
                r++;
                return "Restaurant:  Spicy Chicken Enchilada with Black Beans and Rice";
            }
            if (r == 2)
            {
                r++;
                return "Restaurant:  Spicy Sausage with Tomato Sauce";
            }
            if (r == 3)
            {
                r++;
                return "Restaurant:  Spicy Fish with Tartar Sauce";
            }
            if (r == 4)
            {
                r++;
                return "Restaurant:  Linguine with Spicy Shrimp";
            }
            if (r == 5)
            {
                r++;
                return "Restaurant:  Spicy Chili with Cornbread";
            }
            if (r == 6)
            {
                r++;
                return "Restaurant:  Spicy Sausage Soup with Chopped Kale";
            }
            if (r == 7)
            {
                r++;
                return "Restaurant:  Spicy Fish with Linguine";
            }
            if (r == 8)
            {
                r++;
                return "Restaurant:  Spicy Fish Tacos with Lime Sauce";
            }
            if (r == 9)
            {
                r++;
                return "Restaurant:  Spicy Shrimp in Cocktail Sauce";
            }
        }//while
        r++;
        return "";
    }//restaurant_spicy

    public String get_savory_restaurant()
    {
        while(r < 10 && favorite_food_type.equals("Savory"))
        {
            if (r == 0)
            {
                r++;
                return "Restaurant:  Filet Mignon and Onions";
            }
            if (r == 1)
            {
                r++;
                return "Restaurant:  Surf and Turf";
            }
            if (r == 2)
            {
                r++;
                return "Restaurant:  Clam Chowder with Garlic Bread";
            }
            if (r == 3)
            {
                r++;
                return "Restaurant:  Chicken Fettuccine Alfredo";
            }
            if (r == 4)
            {
                r++;
                return "Restaurant:  Chicken Lettuce Wrap";
            }
            if (r == 5)
            {
                r++;
                return "Restaurant:  Baked Chicken with Quinoa";
            }
            if (r == 6)
            {
                r++;
                return "Restaurant:  Baked Tilapia with Boiled Spinach";
            }
            if (r == 7)
            {
                r++;
                return "Restaurant:  BBQ Ribs with Coleslaw";
            }
            if (r == 8)
            {
                r++;
                return "Restaurant:  Lobster Tail with Melted Butter";
            }
            if (r == 9)
            {
                r++;
                return "Restaurant:  Chicken Noodle Soup and Salad";
            }
        }//while
        r++;
        return "";
    }//retsaurant_savory

    public String get_sweet_restaurant()
    {
        while(r < 10 && favorite_food_type.equals("Sweet"))
        {
            if (r == 0)
            {
                r++;
                return "Restaurant:  Filet Mignon and Onions";
            }
            if (r == 1)
            {
                r++;
                return "Restaurant:  Surf and Turf";
            }
            if (r == 2)
            {
                r++;
                return "Restaurant:  Clam Chowder with Garlic Bread";
            }
            if (r == 3)
            {
                r++;
                return "Restaurant:  Chicken Fettuccine Alfredo";
            }
            if (r == 4)
            {
                r++;
                return "Restaurant:  Chicken Lettuce Wrap";
            }
            if (r == 5)
            {
                r++;
                return "Restaurant:  Baked Chicken with Quinoa";
            }
            if (r == 6)
            {
                r++;
                return "Restaurant:  Baked Tilapia with Boiled Spinach";
            }
            if (r == 7)
            {
                r++;
                return "Restaurant:  BBQ Ribs with Coleslaw";
            }
            if (r == 8)
            {
                r++;
                return "Restaurant:  Lobster Tail with Melted Butter";
            }
            if (r == 9)
            {
                r++;
                return "Restaurant:  Chicken Noodle Soup and Salad";
            }
        }//while
        r++;
        return "";
    }//retsaurant_sweet


// HOME COOKING!


    public String get_spicy_home()
    {
        while(hc < 10 && favorite_food_type.equals("Spicy"))
        {
            if (hc == 0)
            {
                hc++;
                return "Home Cooking:\n\nHot Chicken Salad Recipe\n\nIngredients:\n\n" +
                        "-3 cups cooked rice\n-6 hard boiled eggs, chopped\n-2 cups celery, chopped\n" +
                        "-1/2 cups onion, minced\n-2 cups cooked chicken" +
                        "";
            }
            if (hc == 1)
            {
                hc++;
                return "Home Cooking:\n\nSpicy Turkey Chili Recipe\n\nIngredients:\n\n" +
                        "-3 chicken breasts(diced)\n-1 tbsp garlic\n-2tbsp honey\n-5 tbsp soy sauce\n" +
                        "-2 tbsp sriracha\n-1/2 cup cornstarch\n-1/4 cup sugar\n-1 cup water\n\nInstructions:\n\n" +
                        "";
            }
            if (hc == 2)
            {
                hc++;
                return "Home Cooking:\n\nSpicy-Honey Glazed Chicken Recipe\n\nIngredients:\n\n" +
                "-3 chicken breasts(diced)\n-1 tbsp garlic\n-2tbsp honey\n-5 tbsp soy sauce\n" +
                        "-2 tbsp sriracha\n-1/2 cup cornstarch\n-1/4 cup sugar\n-1 cup water\n\nInstructions:\n\n" +
                        "";
            }
            if (hc == 3)
            {
                hc++;
                return "Home Cooking:\n\nSpicy-Honey Glazed Chicken Recipe\n\nIngredients:\n\n" +
                        "-3 chicken breasts(diced)\n-1 tbsp garlic\n-2tbsp honey\n-5 tbsp soy sauce\n" +
                        "-2 tbsp sriracha\n-1/2 cup cornstarch\n-1/4 cup sugar\n-1 cup water\n\nInstructions:\n\n" +
                        "";
            }
            if (hc == 4)
            {
                hc++;
                return "Home Cooking:\n\nSpicy-Honey Glazed Chicken Recipe\n\nIngredients:\n\n" +
                        "-3 chicken breasts(diced)\n-1 tbsp garlic\n-2tbsp honey\n-5 tbsp soy sauce\n" +
                        "-2 tbsp sriracha\n-1/2 cup cornstarch\n-1/4 cup sugar\n-1 cup water\n\nInstructions:\n\n" +
                        "";
            }
            if (hc == 5)
            {
                hc++;
                return "Home Cooking:\n\nSpicy-Honey Glazed Chicken Recipe\n\nIngredients:\n\n" +
                        "-3 chicken breasts(diced)\n-1 tbsp garlic\n-2tbsp honey\n-5 tbsp soy sauce\n" +
                        "-2 tbsp sriracha\n-1/2 cup cornstarch\n-1/4 cup sugar\n-1 cup water\n\nInstructions:\n\n" +
                        "";
            }
            if (hc == 6)
            {
                hc++;
                return "Home Cooking:\n\nSpicy-Honey Glazed Chicken Recipe\n\nIngredients:\n\n" +
                        "-3 chicken breasts(diced)\n-1 tbsp garlic\n-2tbsp honey\n-5 tbsp soy sauce\n" +
                        "-2 tbsp sriracha\n-1/2 cup cornstarch\n-1/4 cup sugar\n-1 cup water\n\nInstructions:\n\n" +
                        "";
            }
            if (hc == 7)
            {
                hc++;
                return "Home Cooking:\n\nSpicy-Honey Glazed Chicken Recipe\n\nIngredients:\n\n" +
                        "-3 chicken breasts(diced)\n-1 tbsp garlic\n-2tbsp honey\n-5 tbsp soy sauce\n" +
                        "-2 tbsp sriracha\n-1/2 cup cornstarch\n-1/4 cup sugar\n-1 cup water\n\nInstructions:\n\n" +
                        "";
            }
            if (hc == 8)
            {
                hc++;
                return "Home Cooking:\n\nSpicy-Honey Glazed Chicken Recipe\n\nIngredients:\n\n" +
                        "-3 chicken breasts(diced)\n-1 tbsp garlic\n-2tbsp honey\n-5 tbsp soy sauce\n" +
                        "-2 tbsp sriracha\n-1/2 cup cornstarch\n-1/4 cup sugar\n-1 cup water\n\nInstructions:\n\n" +
                        "";
            }
            if (hc == 9)
            {
                hc++;
                return "Home Cooking:\n\nSpicy-Honey Glazed Chicken Recipe\n\nIngredients:\n\n" +
                        "-3 chicken breasts(diced)\n-1 tbsp garlic\n-2tbsp honey\n-5 tbsp soy sauce\n" +
                        "-2 tbsp sriracha\n-1/2 cup cornstarch\n-1/4 cup sugar\n-1 cup water\n\nInstructions:\n\n" +
                        "";
            }
        }//while
        hc++;
        return "";
    }//home_spicy

    public String get_savory_home() //SAVORY
    {
        while(hc < 10 && favorite_food_type.equals("Savory"))
        {
            if (hc == 0)
            {
                hc++;
                return "Home Cooking:\n\nSavory Pot Roast Recipe\n\nIngredients:\n\n" +
                        "-3 to 4 lb. chuck or rump roast\n-1/4 cups flour\n-2 tsp. salt\n1/4 tsp. pepper\n" +
                        "-2 Tbsp. oil\n-1 medium onion, chopped\n-1 clove garlic, minced\n" +
                        "-1(14 oz.) can whole tomatoes with juice\n-1 tsp. seasoned salt\n" +
                        "-1/2 tsp. sugar\n-1/2 tsp. oregano\n\nDirections\n\n" +
                        "Put, flour, salt, and pepper in a plastic bag, add roast and shake to coat.\n" +
                        "Brown roast in hot oil in crockpot. Shake flour bag over browned roast and add\n" +
                        "remaining ingredients. Cover and simmer for 4 - 5 hours on high in crockpot.\n" +
                        "Thicken sauce with flour or cornstarch and serve over cooked noodles.\n" +
                        "Serves 6 - 8.";
            }
            if (hc == 1)
            {
                hc++;
                return "Home Cooking:\n\nSausage Zucchini Casserole Recipe\n\nIngredients:\n\n" +
                        "-1 lb. bulk sausage\n-1 cup rice, partially cooked\n-1 lb. zucchini\n-2 eggs\n" +
                        "-1 medium onion, chopped\n-1 garlic bud, chopped\n-1/2 cups parmesan cheese" +
                        "Cook sausage to remove excess grease. Slight cook the zucchini(2 - 3 cups grated raw)\n" +
                        "Slightly sautee onions. Mix all ingredients together. Bake at 350 F for 1 hour.\n" +
                        "Sprinkle with parmesan cheese.";
            }
            if (hc == 2)
            {
                hc++;
                return "Home Cooking:\n\nSavory Pot Roast Recipe\n\nIngredients:\n\n" +
                        "-3 to 4 lb. chuck or rump roast\n-1/4 cups flour\n-2 tsp. salt\n1/4 tsp. pepper\n" +
                        "-2 Tbsp. oil\n-1 medium onion, chopped\n-1 clove garlic, minced\n" +
                        "-1(14 oz.) can whole tomatoes with juice\n-1 tsp. seasoned salt\n" +
                        "-1/2 tsp. sugar\n-1/2 tsp. oregano\n\nDirections\n\n" +
                        "Put, flour, salt, and pepper in a plastic bag, add roast and shake to coat.\n" +
                        "Brown roast in hot oil in crockpot. Shake flour bag over browned roast and add\n" +
                        "remaining ingredients. Cover and simmer for 4 - 5 hours on high in crockpot.\n" +
                        "Thicken sauce with flour or cornstarch and serve over cooked noodles.\n" +
                        "Serves 6 - 8.";
            }
            if (hc == 3)
            {
                hc++;
                return "Home Cooking:\n\nSavory Pot Roast Recipe\n\nIngredients:\n\n" +
                        "-3 to 4 lb. chuck or rump roast\n-1/4 cups flour\n-2 tsp. salt\n1/4 tsp. pepper\n" +
                        "-2 Tbsp. oil\n-1 medium onion, chopped\n-1 clove garlic, minced\n" +
                        "-1(14 oz.) can whole tomatoes with juice\n-1 tsp. seasoned salt\n" +
                        "-1/2 tsp. sugar\n-1/2 tsp. oregano\n\nDirections\n\n" +
                        "Put, flour, salt, and pepper in a plastic bag, add roast and shake to coat.\n" +
                        "Brown roast in hot oil in crockpot. Shake flour bag over browned roast and add\n" +
                        "remaining ingredients. Cover and simmer for 4 - 5 hours on high in crockpot.\n" +
                        "Thicken sauce with flour or cornstarch and serve over cooked noodles.\n" +
                        "Serves 6 - 8.";
            }
            if (hc == 4)
            {
                hc++;
                return "Home Cooking:\n\nSavory Pot Roast Recipe\n\nIngredients:\n\n" +
                        "-3 to 4 lb. chuck or rump roast\n-1/4 cups flour\n-2 tsp. salt\n1/4 tsp. pepper\n" +
                        "-2 Tbsp. oil\n-1 medium onion, chopped\n-1 clove garlic, minced\n" +
                        "-1(14 oz.) can whole tomatoes with juice\n-1 tsp. seasoned salt\n" +
                        "-1/2 tsp. sugar\n-1/2 tsp. oregano\n\nDirections\n\n" +
                        "Put, flour, salt, and pepper in a plastic bag, add roast and shake to coat.\n" +
                        "Brown roast in hot oil in crockpot. Shake flour bag over browned roast and add\n" +
                        "remaining ingredients. Cover and simmer for 4 - 5 hours on high in crockpot.\n" +
                        "Thicken sauce with flour or cornstarch and serve over cooked noodles.\n" +
                        "Serves 6 - 8.";
            }
            if (hc == 5)
            {
                hc++;
                return "Home Cooking:\n\nSavory Pot Roast Recipe\n\nIngredients:\n\n" +
                        "-3 to 4 lb. chuck or rump roast\n-1/4 cups flour\n-2 tsp. salt\n1/4 tsp. pepper\n" +
                        "-2 Tbsp. oil\n-1 medium onion, chopped\n-1 clove garlic, minced\n" +
                        "-1(14 oz.) can whole tomatoes with juice\n-1 tsp. seasoned salt\n" +
                        "-1/2 tsp. sugar\n-1/2 tsp. oregano\n\nDirections\n\n" +
                        "Put, flour, salt, and pepper in a plastic bag, add roast and shake to coat.\n" +
                        "Brown roast in hot oil in crockpot. Shake flour bag over browned roast and add\n" +
                        "remaining ingredients. Cover and simmer for 4 - 5 hours on high in crockpot.\n" +
                        "Thicken sauce with flour or cornstarch and serve over cooked noodles.\n" +
                        "Serves 6 - 8.";
            }
            if (hc == 6)
            {
                hc++;
                return "Home Cooking:\n\nSavory Pot Roast Recipe\n\nIngredients:\n\n" +
                        "-3 to 4 lb. chuck or rump roast\n-1/4 cups flour\n-2 tsp. salt\n1/4 tsp. pepper\n" +
                        "-2 Tbsp. oil\n-1 medium onion, chopped\n-1 clove garlic, minced\n" +
                        "-1(14 oz.) can whole tomatoes with juice\n-1 tsp. seasoned salt\n" +
                        "-1/2 tsp. sugar\n-1/2 tsp. oregano\n\nDirections\n\n" +
                        "Put, flour, salt, and pepper in a plastic bag, add roast and shake to coat.\n" +
                        "Brown roast in hot oil in crockpot. Shake flour bag over browned roast and add\n" +
                        "remaining ingredients. Cover and simmer for 4 - 5 hours on high in crockpot.\n" +
                        "Thicken sauce with flour or cornstarch and serve over cooked noodles.\n" +
                        "Serves 6 - 8.";
            }
            if (hc == 7)
            {
                hc++;
                return "Home Cooking:\n\nSavory Pot Roast Recipe\n\nIngredients:\n\n" +
                        "-3 to 4 lb. chuck or rump roast\n-1/4 cups flour\n-2 tsp. salt\n1/4 tsp. pepper\n" +
                        "-2 Tbsp. oil\n-1 medium onion, chopped\n-1 clove garlic, minced\n" +
                        "-1(14 oz.) can whole tomatoes with juice\n-1 tsp. seasoned salt\n" +
                        "-1/2 tsp. sugar\n-1/2 tsp. oregano\n\nDirections\n\n" +
                        "Put, flour, salt, and pepper in a plastic bag, add roast and shake to coat.\n" +
                        "Brown roast in hot oil in crockpot. Shake flour bag over browned roast and add\n" +
                        "remaining ingredients. Cover and simmer for 4 - 5 hours on high in crockpot.\n" +
                        "Thicken sauce with flour or cornstarch and serve over cooked noodles.\n" +
                        "Serves 6 - 8.";
            }
            if (hc == 8)
            {
                hc++;
                return "Home Cooking:\n\nSavory Pot Roast Recipe\n\nIngredients:\n\n" +
                        "-3 to 4 lb. chuck or rump roast\n-1/4 cups flour\n-2 tsp. salt\n1/4 tsp. pepper\n" +
                        "-2 Tbsp. oil\n-1 medium onion, chopped\n-1 clove garlic, minced\n" +
                        "-1(14 oz.) can whole tomatoes with juice\n-1 tsp. seasoned salt\n" +
                        "-1/2 tsp. sugar\n-1/2 tsp. oregano\n\nDirections\n\n" +
                        "Put, flour, salt, and pepper in a plastic bag, add roast and shake to coat.\n" +
                        "Brown roast in hot oil in crockpot. Shake flour bag over browned roast and add\n" +
                        "remaining ingredients. Cover and simmer for 4 - 5 hours on high in crockpot.\n" +
                        "Thicken sauce with flour or cornstarch and serve over cooked noodles.\n" +
                        "Serves 6 - 8.";
            }
            if (hc == 9)
            {
                hc++;
                return "Home Cooking:\n\nSavory Pot Roast Recipe\n\nIngredients:\n\n" +
                        "-3 to 4 lb. chuck or rump roast\n-1/4 cups flour\n-2 tsp. salt\n1/4 tsp. pepper\n" +
                        "-2 Tbsp. oil\n-1 medium onion, chopped\n-1 clove garlic, minced\n" +
                        "-1(14 oz.) can whole tomatoes with juice\n-1 tsp. seasoned salt\n" +
                        "-1/2 tsp. sugar\n-1/2 tsp. oregano\n\nDirections\n\n" +
                        "Put, flour, salt, and pepper in a plastic bag, add roast and shake to coat.\n" +
                        "Brown roast in hot oil in crockpot. Shake flour bag over browned roast and add\n" +
                        "remaining ingredients. Cover and simmer for 4 - 5 hours on high in crockpot.\n" +
                        "Thicken sauce with flour or cornstarch and serve over cooked noodles.\n" +
                        "Serves 6 - 8.";
            }
        }//while
        hc++;
        return "";
    }//home_savory


    public String get_sweet_home() //SAVORY
    {
        while(hc < 10 && favorite_food_type.equals("Sweet"))
        {
            if (hc == 0)
            {
                hc++;
                return "Home Cooking:\n\nSpicy-Honey Glazed Chicken Recipe\n\nIngredients:\n\n" +
                        "-3 chicken breasts(diced)\n-1 tbsp garlic\n-2tbsp honey\n-5 tbsp soy sauce\n" +
                        "-2 tbsp sriracha\n-1/2 cup cornstarch\n-1/4 cup sugar\n-1 cup water\n\nInstructions:\n\n" +
                        "";
            }
            if (hc == 1)
            {
                hc++;
                return "Home Cooking:\n\nSpicy-Honey Glazed Chicken Recipe\n\nIngredients:\n\n" +
                        "-3 chicken breasts(diced)\n-1 tbsp garlic\n-2tbsp honey\n-5 tbsp soy sauce\n" +
                        "-2 tbsp sriracha\n-1/2 cup cornstarch\n-1/4 cup sugar\n-1 cup water\n\nInstructions:\n\n" +
                        "";
            }
            if (hc == 2)
            {
                hc++;
                return "Home Cooking:\n\nSpicy-Honey Glazed Chicken Recipe\n\nIngredients:\n\n" +
                        "-3 chicken breasts(diced)\n-1 tbsp garlic\n-2tbsp honey\n-5 tbsp soy sauce\n" +
                        "-2 tbsp sriracha\n-1/2 cup cornstarch\n-1/4 cup sugar\n-1 cup water\n\nInstructions:\n\n" +
                        "";
            }
            if (hc == 3)
            {
                hc++;
                return "Home Cooking:\n\nSpicy-Honey Glazed Chicken Recipe\n\nIngredients:\n\n" +
                        "-3 chicken breasts(diced)\n-1 tbsp garlic\n-2tbsp honey\n-5 tbsp soy sauce\n" +
                        "-2 tbsp sriracha\n-1/2 cup cornstarch\n-1/4 cup sugar\n-1 cup water\n\nInstructions:\n\n" +
                        "";
            }
            if (hc == 4)
            {
                hc++;
                return "Home Cooking:\n\nSpicy-Honey Glazed Chicken Recipe\n\nIngredients:\n\n" +
                        "-3 chicken breasts(diced)\n-1 tbsp garlic\n-2tbsp honey\n-5 tbsp soy sauce\n" +
                        "-2 tbsp sriracha\n-1/2 cup cornstarch\n-1/4 cup sugar\n-1 cup water\n\nInstructions:\n\n" +
                        "";
            }
            if (hc == 5)
            {
                hc++;
                return "Home Cooking:\n\nSpicy-Honey Glazed Chicken Recipe\n\nIngredients:\n\n" +
                        "-3 chicken breasts(diced)\n-1 tbsp garlic\n-2tbsp honey\n-5 tbsp soy sauce\n" +
                        "-2 tbsp sriracha\n-1/2 cup cornstarch\n-1/4 cup sugar\n-1 cup water\n\nInstructions:\n\n" +
                        "";
            }
            if (hc == 6)
            {
                hc++;
                return "Home Cooking:\n\nSpicy-Honey Glazed Chicken Recipe\n\nIngredients:\n\n" +
                        "-3 chicken breasts(diced)\n-1 tbsp garlic\n-2tbsp honey\n-5 tbsp soy sauce\n" +
                        "-2 tbsp sriracha\n-1/2 cup cornstarch\n-1/4 cup sugar\n-1 cup water\n\nInstructions:\n\n" +
                        "";
            }
            if (hc == 7)
            {
                hc++;
                return "Home Cooking:\n\nSpicy-Honey Glazed Chicken Recipe\n\nIngredients:\n\n" +
                        "-3 chicken breasts(diced)\n-1 tbsp garlic\n-2tbsp honey\n-5 tbsp soy sauce\n" +
                        "-2 tbsp sriracha\n-1/2 cup cornstarch\n-1/4 cup sugar\n-1 cup water\n\nInstructions:\n\n" +
                        "";
            }
            if (hc == 8)
            {
                hc++;
                return "Home Cooking:\n\nSpicy-Honey Glazed Chicken Recipe\n\nIngredients:\n\n" +
                        "-3 chicken breasts(diced)\n-1 tbsp garlic\n-2tbsp honey\n-5 tbsp soy sauce\n" +
                        "-2 tbsp sriracha\n-1/2 cup cornstarch\n-1/4 cup sugar\n-1 cup water\n\nInstructions:\n\n" +
                        "";
            }
            if (hc == 9)
            {
                hc++;
                return "Home Cooking:\n\nSpicy-Honey Glazed Chicken Recipe\n\nIngredients:\n\n" +
                        "-3 chicken breasts(diced)\n-1 tbsp garlic\n-2tbsp honey\n-5 tbsp soy sauce\n" +
                        "-2 tbsp sriracha\n-1/2 cup cornstarch\n-1/4 cup sugar\n-1 cup water\n\nInstructions:\n\n" +
                        "";
            }
        }//while
        hc++;
        return "";
    }//home_sweet




}//end_program
