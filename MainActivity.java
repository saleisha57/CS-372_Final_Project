package com.randomfood.www.final_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;

/**
 *  This program will randomly generate a food option for the user based on the food type that they enter.
 * */

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    String [] ff_spicy_choice = new String[10];
    String [] ff_savory_choice = new String[10];
    String [] ff_sweet_choice = new String[10];
    String [] r_spicy_choice = new String[10];
    String [] r_savory_choice = new String[10];
    String [] r_sweet_choice = new String[10];
    String [] hc_spicy_choice = new String[7];
    String [] hc_savory_choice = new String[7];
    String [] hc_sweet_choice = new String[7];
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

    /**
     *  This method sets up the food type from the users input when they click the button.
     * */

    public void onClick(View v)
    {
        EditText e = (EditText)MainActivity.this.findViewById(R.id.FavoriteFood);
        favorite_food_type = e.getText().toString();
        init();
    }

    /**
     *  This method fills the arrays with the corresponding information based on the user's input. 3 numers are randomly generated.
     *  The first number is to determine the food place(home, restaurant, or fast food). The second determines which element of the array
     *  will displayed to the user. The third number is for the home cooking array, since there are fewer elements than restaurant
     *  or fast food.
     * */

    public void init()
    {
        int number = rand.nextInt(3);
        int number_2 = rand.nextInt(10);
        int number_3 = rand.nextInt(7);

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
            for (i = 0; i < 7; i++) {
                hc_spicy_choice[i] = get_spicy_home();
            }//for
            hc = 0;
            for (i = 0; i < 7; i++) {
                hc_savory_choice[i] = get_savory_home();
            }//for
            hc = 0;
            for (i = 0; i < 7; i++) {
                hc_sweet_choice[i] = get_sweet_home();
            }//for

            for (i = 0; i < 7; i++)
                if (number == 2 && number_3 == i && favorite_food_type.equals("Savory"))
                {
                    Intent intent = new Intent(this, DisplayActivity.class);
                    intent.putExtra("Display", hc_savory_choice[i]);
                    startActivity(intent);
                }

            for (i = 0; i < 7; i++)
                if (number == 2 && number_3 == i && favorite_food_type.equals("Spicy"))
                {
                    Intent intent = new Intent(this, DisplayActivity.class);
                    intent.putExtra("Display", hc_spicy_choice[i]);
                    startActivity(intent);
                }

            for (i = 0; i < 7; i++)
                if (number == 2 && number_3 == i && favorite_food_type.equals("Sweet"))
                {
                    Intent intent = new Intent(this, DisplayActivity.class);
                    intent.putExtra("Display", hc_sweet_choice[i]);
                    startActivity(intent);
                }
            hc = 0;
        }//if

    }//init

    /**
     *  The next three methods set up each of the respective fast food options. First is spicy, then savory, then sweet.
     * */

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
                return "Fast Food:  Ice Cream Cone";
            }
            if (ff == 3)
            {
                ff++;
                return "Fast Food:  Ice Cream Sundae";
            }
            if (ff == 4)
            {
                ff++;
                return "Fast Food:  Chocolate Chip Cookies";
            }
            if (ff == 5)
            {
                ff++;
                return "Fast Food:  Ice Cream Sandwich";
            }
            if (ff == 6)
            {
                ff++;
                return "Fast Food:  Chocolate Bar";
            }
            if (ff == 7)
            {
                ff++;
                return "Fast Food:  Fruit Cup";
            }
            if (ff == 8)
            {
                ff++;
                return "Fast Food:  Banana Split";
            }
            if (ff == 9)
            {
                ff++;
                return "Fast Food:  Sugar Cookies";
            }
        }//while
        ff++;
        return "";
    }//fast_food_sweet


    /**
     *  The next 3 methods set up each of the respective arrays for the restaurant option. First is spicy, then savory, then sweet.
     * */

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
                return "Restaurant:  Creme Brulee";
            }
            if (r == 1)
            {
                r++;
                return "Restaurant:  Chocolate Lava Cake";
            }
            if (r == 2)
            {
                r++;
                return "Restaurant:  Strawberry Cheesecake";
            }
            if (r == 3)
            {
                r++;
                return "Restaurant:  Cherry Cheesecake";
            }
            if (r == 4)
            {
                r++;
                return "Restaurant:  Carrot Cake";
            }
            if (r == 5)
            {
                r++;
                return "Restaurant:  Dessert Pizza";
            }
            if (r == 6)
            {
                r++;
                return "Restaurant:  Cherry Pie";
            }
            if (r == 7)
            {
                r++;
                return "Restaurant:  Blueberry Pie";
            }
            if (r == 8)
            {
                r++;
                return "Restaurant:  Pecan Pie";
            }
            if (r == 9)
            {
                r++;
                return "Restaurant:  Ice Cream Sundae";
            }
        }//while
        r++;
        return "";
    }//retsaurant_sweet


    /**
     *  The next 3 methods set up each of the respective arrays for the home cooking option. First is spicy, then savory, then sweet.
     *  Each one should print out a recipe depending on random number generation.
     * */

    public String get_spicy_home()
    {
        while(hc < 7 && favorite_food_type.equals("Spicy"))
        {
            if (hc == 0)
            {
                hc++;
                return "Home Cooking:\n\nSpicy Mint Steak Recipe\n\nIngredients:\n\n" +
                        "-3 Tbsp. vegetable or canola oil\n-4 cloves garlic, minced\n" +
                        "-2 - 3 Thai chilies or serrano chilies, stemmed and thinly sliced\n" +
                        "-1 lb. flank steak, very thinly sliced\n-3 medium shallots, thinly sliced\n" +
                        "-1 red bell pepper, cut into 1/8-inch-thick slices\n-1/4 cups fish sauce\n" +
                        "-2 Tbsp. sweet soy sauce\n-2 Tbsp black soy sauce\n-1 Tbsp. chili paste in soybean oil\n" +
                        "-1 1/2 cups chopped fresh Thai basil leaves\n-1 cup whole fresh mint leaves\n" +
                        "-White rice, for serving\n\nDirections:\n\n" +
                        "In a large skillet, heat the oil over medium-high heat. Add the garlic and chilies and\n" +
                        "cook until aromatic. Add the steak and cook, stirring frequently, for 2 minutes.\n" +
                        "Add the shallots and bell pepper and cook 1 minute. Add the fish sauce, sweet soy sauce, black soy\n" +
                        "sauce and chili paste. Bring the mixture to a low simmer and cook, stirring frequently, until the meat\n" +
                        "is cooked through and the vegetables are tender. Remove the skillet from the heat and\n" +
                        "stir in basil and mint until wilted. Serve over rice.";

            }
            if (hc == 1)
            {
                hc++;
                return "Home Cooking:\n\nBuffalo Chicken Jalapeno Poppers Recipe\n\nIngredients:\n\n" +
                        "-1/2 cups buffalo wing sauce\n-1 cup cooked chicken\n-20 jalapeno peppers\n" +
                        "-1/2 cups blue cheese salad dressing\n-1 pkg. cream cheese\n-1 1/2 cups mozzarella cheese\n\nDirections:\n\n" +
                        "Cur the peppers in half, lengthwise leaving the stems intact. Scrape out and discard the seeds\n" +
                        "In a small bowl, cobime the remaining ingredients. Stuff into pepper halves.\n" +
                        "Place ina greased baking sheet.Bake uncovered at 325 f for 20 minutes.";
            }
            if (hc == 2)
            {
                hc++;
                return "Home Cooking:\n\nSpicy Garlic Shrimp Recipe\n\nIngredients:\n\n" +
                        "-1 Tbsp. olive oil\n-1 lb. large shrimp, peeled and deveined\n-1 tsp. grlic, minced\n" +
                        "-1/4 - 1/2 tsp. red pepper flakes\n-1 tsp. lemon zest\n-1 Tbsp. lemon juice\n" +
                        "-2 Tbsp. chopped parsley or cilantro\n-salt & pepper to taste\n\nDirections:\n\n" +
                        "In a large skillet, heat oil over high heat. Season the shrimp with salt & pepper. Cook\n" +
                        "the shrimp until they are pink or opaque. Stir in garlic, red pepper flakes and lemon zest, cook for\n" +
                        "1 - 2 minutes. Add in lemon juice and parsley/cilantro, then serve.";
            }
            if (hc == 3)
            {
                hc++;
                return "Home Cooking:\n\nSpicy Turkey Chili Recipe\n\nIngredients:\n\n" +
                        "-2 lbs. grouned turkey(browned)\n-2 15 oz. cans dark kidney beans\n-1 15 oz. can light kidney beans\n" +
                        "-1 large onion, chopped\n-1/2 cup salsa\n-2 15 oz. canstomato sauce\n-1 15 oz. can water\n" +
                        "-1 Tbsp. brown sugar\n-3 tsp. cumin, ground\n-2 1/2 Tbsp. chili powder\n-3 tsp. garlic powder\n" +
                        "-2 tsp. oregano\n-2 tsp. basil\n-1/2 tsp. salt\n-1/2 tsp. pepper\n\nDirections:\n\n" +
                        "Brown the turkey. Add seasonings, including cumin, chili powder, garlic powder, oregano, basil, salt, and pepper.\n" +
                        "Add onion, drained beans, salse,tomato sauce, water, and brown sugar. Simmer on low for at least an hour.\n" +
                        "(If using a slow cooker, cook on low for 4 - 6 hours). Garnish with cheddar cheese and sour cream. ";
            }
            if (hc == 4)
            {
                hc++;
                return "Home Cooking:\n\nBuffalo Oyster Crackers Recipe\n\nIngredients:\n\n" +
                        "-10 - 12 oz. pkg. oyster crackers\n-1 oz. pack ranch seasoning mix\n-1/3 cups hot sauce\n" +
                        "-4 Tbsp. butter\n\nDirections:\n\n" +
                        "Preheat oven to 250 F. Line baking sheet with parchment paper or foil. Combine ranch\n" +
                        "ranch seasoning packet, melted butter and hot sauce in small bowl. pour oyster crackers\n" +
                        "in a large bowl, and the hot sauce mixture over the top. Stir gently. Pour crackers onto baking sheet.\n" +
                        "Bake for 15 - 20 minutes, stirring every 5 minutes. Remove from oven an cool.";
            }
            if (hc == 5)
            {
                hc++;
                return "Home Cooking:\n\nJamaican Jerk Chicken Recipe\n\nIngredients:\n\n" +
                        "-3/4 cups packed brown sugar\n-3/4 cups allspice, ground\n-3/4 cups scallions, minced\n" +
                        "-1/3 cups black pepper, ground\n-1/4 cups kosher salt\n-1/4 cups ginger, minced\n" +
                        "-1/4 cups lime juice\n-2 Tbsp. soy sauce\n-1 Tbsp. thyme, dried\n-1 tsp. cinnamon, ground\n" +
                        "1 tsp. nutmeg, freshly grated\n-1/2 tsp. cloves, ground\n-8 garlic cloves, minced\n" +
                        "-3 scotch bonnet or habanero chilies, stemmed and minced\n-2 (3 - 4)lb. chickens, quartered\n\nDirections:\n\n" +
                        "Combine suger, allspice, scallions, oil, pepper, salt, giner, lime juice, soy sauce,\n" +
                        "thyme, cinnamon, nutmeg, cloves, garlic, and chilies in a bowl. Add chicken. Toss to coat.\n" +
                        "Cover in plastic wrap and chill at least 6 hours.\nHeat grill to medium. Add chicken, skin side down.\n" +
                        "Cook, turning once, unntil a crust forms on the outside. Cover grill and cook about 40 minutes.";
            }
            if (hc == 6)
            {
                hc++;
                return "Home Cooking:\n\nBuffalo Cauliflower Bites Recipe\n\nIngredients:\n\n" +
                        "-1 medium head of cauliflower, chopped into bite sized pieces\n-1/2 cups garbanzo bean flour\n" +
                        "-1/2 cups water\n-1 tsp. garlic powder\n-1/2 tsp. salt\n-1 tsp. melted butter\n" +
                        "-2/3 cups hot sauce\n\nDirections:\n\n" +
                        "Preheat oven to 450 F. In a medium bowl, combine flour, water, garlic powder, ad salt.\n" +
                        "Whisk until smooth. Toss cauliflower into batter, evenly coating each piece. Place on\n" +
                        "lightly greased non-stick baking sheet. Bake for 15 minutes, tossing halfway through.\n" +
                        "In the meantime, combine melted butter and hot sauce in a large bowl. When the cauliflower is done,\n" +
                        "remove it from the oven, and toss in hot sauce mixture. Bake cauliflower again for an addition 25\n" +
                        "minutes until it becomes crispy. Allow the cauliflower to cool for 15 minutes before serving.";
            }

        }//while
        hc++;
        return "";
    }//home_spicy

    public String get_savory_home() //SAVORY
    {
        while(hc < 7 && favorite_food_type.equals("Savory"))
        {
            if (hc == 0)
            {
                hc++;
                return "Home Cooking:\n\nSavory Pot Roast Recipe\n\nIngredients:\n\n" +
                        "-3 to 4 lb. chuck or rump roast\n-1/4 cups flour\n-2 tsp. salt\n1/4 tsp. pepper\n" +
                        "-2 Tbsp. oil\n-1 medium onion, chopped\n-1 clove garlic, minced\n" +
                        "-1(14 oz.) can whole tomatoes with juice\n-1 tsp. seasoned salt\n" +
                        "-1/2 tsp. sugar\n-1/2 tsp. oregano\n\nDirections:\n\n" +
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
                        "-1 medium onion, chopped\n-1 garlic bud, chopped\n-1/2 cups parmesan cheese\n\nDirections:\n\n" +
                        "Cook sausage to remove excess grease. Slight cook the zucchini(2 - 3 cups grated raw)\n" +
                        "Slightly sautee onions. Mix all ingredients together. Bake at 350 F for 1 hour.\n" +
                        "Sprinkle with parmesan cheese.";
            }
            if (hc == 2)
            {
                hc++;
                return "Home Cooking:\n\nSour Cream Chicken Recipe\n\nIngredients:\n\n" +
                        "-3 - 4 lbs. chicken, whole or pieces\n-1 cup cream of mushroom soup\n" +
                        "-small carton sour cream\n-small onion, sliced\n-fresh mushrooms sliced\n" +
                        "-potatoes, cut in quarters\n\nDirections:\n\n" +
                        "Mix soup, sour cream and onion. Pour mixture over uncooked chicken in slow cooker\n" +
                        "Add mushrooms(or any other vegetable desired) and potatoes. Cook on medium heat\n" +
                        "for at least 5 hours.";
            }
            if (hc == 3)
            {
                hc++;
                return "Home Cooking:\n\nSalmon Fettucinni Recipe\n\nIngredients:\n\n" +
                        "-1 pkg. fettucinni noodles\n-1 pkg. smoked salmon\n-1 jar alfredo sauce\n" +
                        "1 tsp. liquid smoke\n-garlic salt(to taste)\n-onions, dried or fresh(optional)\n\nDirections:\n\n" +
                        "Cook noodles as directed on package. When noodles are finished, stir together\n" +
                        "alfredo sauce, liquid smoke, garlic salt, and onions. Break smoked salmon into\n" +
                        "small pieces(watch for bones). Add into the sauce. Taste. Add more liquid smoke\n" +
                        "or garlic salt as needed. Heat to desired temperature. Stir noodles into sauce. Serve.";
            }
            if (hc == 4)
            {
                hc++;
                return "Home Cooking:\n\nTurkey or Chicken Enchiladas Recipe\n\nIngredients:\n\n" +
                        "-2 cups turkey or chicken, cooked/shredded\n-1 can cream of celery or mushroom soup\n" +
                        "-1/2 cups milk\n-1 clove garlic, chopped\n-12 flour tortillas\n" +
                        "1 cup monterey jack cheese, shredded\n-1/2 cups green onions, sliced\n" +
                        "-1/2 cups sliced olives\n\nDirections:\n\n" +
                        "In large skillet, combine turkey/chicken, soup, milk, and garlic. Simmer covered\n" +
                        "for 10 minutes. Spray baking pan with non-stick cooking spray. Put spoon full of\n" +
                        "turkey/chicken mixture in middle of tortilla and roll up. Place tortillas seam\n" +
                        "side down in baking pan; top with cheese, green onions, and olives. Bake at\n" +
                        "375 F for 25 minutes. Serve with sour cream, guacamole, and salsa.";
            }
            if (hc == 5)
            {
                hc++;
                return "Home Cooking:\n\nMeatballs Recipe\n\nIngredients:\n\n" +
                        "-2 lbs. hamburger\n-2 eggs, beaten\n-1/2 cups rice(raw)\n-1/2 cups crakers, crushed\n" +
                        "-1 small onion, chopped fine\n-salt & pepper\n-2 cans tomato soup\n-3 cans cream of mushroom soup\n" +
                        "-1/2 can water\n\nDirections:\n\n" +
                        "Mix ground beef, eggs, rice, cracker crumbs, onion and salt & pepper together and roll into\n" +
                        "small balls. Place balls in a 9x12 glass casserole pan. Mix soups and water together; pour\n" +
                        " over meatballs. Cover with foil, bake for 1 1/2 hours at 350 F.";
            }
            if (hc == 6)
            {
                hc++;
                return "Home Cooking:\n\nJamaican Pumpkin Soup Recipe\n\nIngredients:\n\n" +
                        "SOUP:\n" +
                        "-3 lb. pumpkin, peeled/cubed\n-4 pieces fryer chicken, cut up/white & dark\n" +
                        "-2 - 3 bouillon cubes\n-1/2 tsp. pepper\n-1 1/2 tsp. salt\n-2 - 3 potatoes, peeled/cubed\n" +
                        "-1 small yam, peeled/cubed\n-2 cups carrots, sliced\n-1 small onion, sliced\n" +
                        "-2 cloves garlic, smashed\n\nDUMPLINGS:\n-1 1/2 cups flour\n-1/3 cups water\n-1/2 tsp. salt\n\nDirections:\n\n" +
                        "For soup: boil pumpkin, chicken and bouillon cubes for 2 - 3 hours or until pumpkin\n" +
                        "is dissolved(press cubes against pot to help dissolve). Remove chicken pieces and take meat off bone.\n" +
                        "Put chicken back in pot along with all remaining ingredients. Cook on medium/low until all\n" +
                        "vegetables are done. Dor dumplings: mix ingredients and roll into silver dollar sized\n" +
                        "dumplings. Place dumplings in soup and let simmer for 15 - 20 minutes.";
            }
        }//while

        hc++;
        return "";
    }//home_savory


    public String get_sweet_home() {
        while (hc < 7 && favorite_food_type.equals("Sweet")) {
            if (hc == 0) {
                hc++;
                return "Home Cooking:\n\nPecan Pie Recipe\n\nIngredients:\n\n" +
                        "-1/2 cups butter\n-1 cup sugar\n-1 cup dark corn syrup\n-1/2 tsp. salt\n" +
                        "-1 1/2 tsp. vanilla\n-3 eggs\n-2 cups chapped pecans\n-unbaked pie shell\n\nDirections:\n\n" +
                        "Let butter stand at room temperature until soft. Add sugar, corn syrup, salt, and\n" +
                        "vanilla. Blend by hand. Add eggs and beat. Fold in pecans. Pour into unbaked pie shell\n" +
                        "and bake at 375 F for 40 - 50 minutes.";
            }
            if (hc == 1) {
                hc++;
                return "Home Cooking:\n\nChocolate Cake Recipe\n\nIngredients:\n\n" +
                        "-1 cup water\n-1/2 cups shortening\n-1/2 cups margarine\n" +
                        "-3 1/2 Tbsp. cocoa\n-2 cups flour\n-2 cups sugar\n-1/2 cups buttermilk\n" +
                        "-2 eggs, beaten\n-1 tsp. baking soda\n-1 tsp. vanilla\n\nDirections:\n\n" +
                        "Combine water, shortening, margarine and cocoa in saucepan. Cook over mild heat\n" +
                        "stirring until it boils. Combine flour and sugar in large mixing bowl. Stir in\n" +
                        "buttermilk, eggs, baking soda and vanilla. Grease and flour 13x9 pan.\n" +
                        "Bake at 400 F for 20 - 30 minutes.";
            }
            if (hc == 2) {
                hc++;
                return "Home Cooking:\n\nFresh Apple Cake Recipe\n\nIngredients:\n\n" +
                        "-1/2 cups butter or margarine\n-1 cup sugar\n-1 egg\n-1 1/2 cups flour\n" +
                        "1 tsp. baking soda\n-1 tsp. ground cinnamon\n-1 tsp. ground nutmeg\n" +
                        "-1/2 tsp. salt\n-2 1/2 cups tart cooking apples, finley chopped\n" +
                        "-1/2 cups walnuts, coarsely chopped\n\nDirections:\n\n" +
                        "In mixing bowl, cream butter and sugar; beat in egg. In separate mixing bowl stir\n" +
                        "together dry ingredients(except nuts), mixing well. Stir into creamed mixture.\n" +
                        "Stir in apple. Turn into ungreased 9 - inch baking pan and sprinkle with nuts.\n" +
                        "Bake at 350 F for 40 - 45 minutes or until cake tests done.";
            }
            if (hc == 3) {
                hc++;
                return "Home Cooking:\n\nPumpkin Cookies Recipe\n\nIngredients:\n\n" +
                        "-1 large can pumpkin pie mix\n-3 cups white sugar\n-3 eggs\n" +
                        "-1 1/2 cups shortening\n-2 tsp. salt\n-5 tsp. pumpkin pie spice\n" +
                        "-2 tsp. baking soda\n-6 cups flour\n-12 oz. bag chocolate chips\n\nDirections:\n\n" +
                        "In large bowl, mix all ingredients together. Drop by teaspoonful on cookie\n" +
                        "sheet. Bake at 350 F for 10 - 12 minutes.\nMakes 7 dozen.";
            }
            if (hc == 4) {
                hc++;
                return "Home Cooking:\n\nCherry Pepsi Salad Recipe\n\nIngredients:\n\n" +
                        "-1 large can pie cherries\n-2/3 cups sugar\n-1/2 cups water\n-2 small cans crushed pineapple\n" +
                        "-2 - 3oz. pkg. cherry jell-o\n-Approx. 18 oz. pepsi\n\nDirections:\n\n" +
                        "Combine cherries, sugar, and water in saucepan and bring to a boil. Add cherry\n" +
                        "jell-o and crushed pineapples. Let cool for a few minutes then add pepsi. stir,\n" +
                        "pour into pan and let set.";
            }
            if (hc == 5) {
                hc++;
                return "Home Cooking:\n\nChocolate Krispies Recipe\n\nIngredients:\n\n" +
                        "-1 cup karo syrup\n-1 cup sugar\n-1 cup peanut butter\n-6 cups rice krispies\n" +
                        "-6 oz. chocolate chips\n-6 oz. butterscotch chips\n\nDirections:\n\n" +
                        "Bring syrup and sugar just to a boil. Add peanut butter. In a large bowl, pour\n" +
                        "over rice krispies. Layer into lightlybuttered 8x10 cake pan. in top of\n" +
                        "double boiler, melt chips. Pour over rice krispies mixture. Cool, cut into squares.";
            }
            if (hc == 6) {
                hc++;
                return "Home Cooking:\n\nPeach Crumble Pie Recipe\n\nIngredients:\n\n" +
                        "-1 unbakes 8 - inch pie shell\n-3/4 cups sugar\n-1/3 cups flour\n" +
                        "/1 1/16 tsp. salt\n-1/2 tsp. cinnamon\n-1/4 cups butter\n- 2 1/2 cups juicy peaches, sliced\n\nDirections:\n\n" +
                        "Line bottom of pie pan with plain pastry. Combine sugar, flour, salt, and cinnamon.\n" +
                        "Add butter and work together with fingertips or pastry cutter until crumbly.\n" +
                        "Add 1/2 of this mixture to peaches. Mix lightly and turn into the pastry shell.\n" +
                        "Sprinkle the remaining mixture over the top. Bake at 425 F for 30 - 35 minutes.\n" +
                        "Cut while hot and let cool for 2 - 3 hours.";
            }

        }//while
        hc++;
        return "";
    }




}//end_program
