package com.sainsburys.ripefruits.app.dao;

import java.util.ArrayList;
import java.util.List;

import com.sainsburys.ripefruits.app.model.FruitModel;

/**
 * The Class StaticData.
 */
public class StaticData {
	
	/** The fruits. */
	private static List<FruitModel> fruits = new ArrayList<FruitModel>();
	
	static{
		
		FruitModel avocadoLoose1  = new FruitModel();
		avocadoLoose1.setDescription("Great to eat now - refrigerate at home 1 of 5 a day 1 avocado counts as 1 of your 5...");
		avocadoLoose1.setSize("275g");
		avocadoLoose1.setSku("1");
		avocadoLoose1.setTitle("Sainsbury's Avocado Ripe & Ready XL Loose 300g");
		avocadoLoose1.setUnit_price(1.5);
		
		FruitModel avocado2  = new FruitModel();
		avocado2.setDescription("Great to eat now - refrigerate at home 1 of 5 a day 1 avocado counts as 1 of your 5...");
		avocado2.setSize("275g");
		avocado2.setSku("2");
		avocado2.setTitle("Sainsbury's Avocado, Ripe & Ready x2");
		avocado2.setUnit_price(1.8);
		
		
		FruitModel avocado4  = new FruitModel();
		avocado4.setDescription("Great to eat now - refrigerate at home 1 of 5 a day 1 avocado counts as 1 of your 5...");
		avocado4.setSize("275g");
		avocado4.setSku("3");
		avocado4.setTitle("Sainsbury's Avocados, Ripe & Ready x4");
		avocado4.setUnit_price(3.20);
		
		FruitModel avocado4Ripe  = new FruitModel();
		
		avocado4Ripe.setDescription("Great to eat now - refrigerate at home 1 of 5 a day 1 avocado counts as 1 of your 5...");
		avocado4Ripe.setSize("275g");
		avocado4Ripe.setSku("4");
		avocado4Ripe.setTitle("Sainsbury's Conference Pears, Ripe & Ready x4 (minimum)");
		avocado4Ripe.setUnit_price(2.00);
		
		
		FruitModel kiwi4  = new FruitModel();
		
		kiwi4.setDescription("Great to eat now - refrigerate at home 1 of 5 a day 1 Kiwi counts as 1 of your 5...");
		kiwi4.setSize("x4");
		kiwi4.setSku("5");
		kiwi4.setTitle("Sainsbury's Golden Kiwi x4");
		kiwi4.setUnit_price(1.80);
		
		FruitModel kiwi  = new FruitModel();
		
		kiwi.setDescription("Great to eat now - refrigerate at home 1 of 5 a day 1 Kiwi counts as 1 of your 5...");
		kiwi.setSize("x4");
		kiwi.setSku("6");
		kiwi.setTitle("Sainsbury's Kiwi Fruit, Ripe & Ready x4");
		kiwi.setTitle("Sainsbury's Kiwi Fruit, SO Organic x4");
		kiwi.setUnit_price(1.80);
		
		
		
		FruitModel kiwiOrganic  = new FruitModel();
		
		kiwiOrganic.setDescription("Great to eat now - refrigerate at home 1 of 5 a day 1 Kiwi counts as 1 of your 5...");
		kiwiOrganic.setSize("x4");
		kiwiOrganic.setSku("7");
		kiwiOrganic.setTitle("Sainsbury's Kiwi Fruit, SO Organic x4");
		kiwiOrganic.setUnit_price(1.00);
		
		
		FruitModel mango2  = new FruitModel();
		
		mango2.setDescription("Great to eat now - refrigerate at home 1 of 5 a day 1 Mango counts as 1 of your 5...");
		mango2.setSize("300g");
		mango2.setSku("8");
		mango2.setTitle("Sainsbury's Mango, Ripe & Ready x2");
		mango2.setUnit_price(2.25);
		
		
		FruitModel nectarines4  = new FruitModel();
		nectarines4.setDescription("Great to eat now - refrigerate at home 1 of 5 a day 1 Nectarines counts as 1 of your 5...");
		nectarines4.setSize("x4");
		nectarines4.setSku("9");
		nectarines4.setTitle("Sainsbury's Nectarines, Ripe & Ready x4");
		nectarines4.setUnit_price(4.00);
		
		
		FruitModel papaya  = new FruitModel();
		
		papaya.setDescription("Great to eat now - refrigerate at home 1 of 5 a day 1 papaya counts as 1 of your 5...");
		papaya.setSize("6, 9Count");
		papaya.setSku("10");
		papaya.setTitle("Sainsbury's Papaya, Ripe (each)");
		papaya.setUnit_price(1.50);
		
		
		
		FruitModel peaches4  = new FruitModel();
		
		peaches4.setDescription("Great to eat now - refrigerate at home 1 of 5 a day 1 Peaches counts as 1 of your 5...");
		peaches4.setSize("4 Count");
		peaches4.setSku("11");
		peaches4.setTitle("Sainsbury's Peaches Ripe & Ready x4");
		peaches4.setUnit_price(4);
		
		FruitModel pears4Ready  = new FruitModel();
		
		pears4Ready.setDescription("Great to eat now - refrigerate at home 1 of 5 a day 1 Pears counts as 1 of your 5...");
		pears4Ready.setSize("4 Count");
		pears4Ready.setSku("12");
		pears4Ready.setTitle("Sainsbury's Pears, Ripe & Ready x4 (minimum)");
		pears4Ready.setUnit_price(2);
		
		FruitModel plums5Ripe  = new FruitModel();
		
		plums5Ripe.setDescription("Great to eat now - refrigerate at home 1 of 5 a day 1 papaya counts as 1 of your 5...");
		plums5Ripe.setSize("5 Count");
		plums5Ripe.setSku("13");
		plums5Ripe.setTitle("Sainsbury's Plums Ripe & Ready x5");
		plums5Ripe.setUnit_price(2.5);
		
		FruitModel pears4Organic  = new FruitModel();
		
		pears4Organic.setDescription("Great to eat now - refrigerate at home 1 of 5 a day 1 papaya counts as 1 of your 5...");
		pears4Organic.setSize("4 Count");
		pears4Organic.setSku("14");
		pears4Organic.setTitle("Sainsbury's Ripe & Ready Red Pear, SO Organic x4");
		pears4Organic.setUnit_price(1.50);
		
		
		fruits.add(avocadoLoose1);
		fruits.add(avocado2);
		fruits.add(avocado4);
		fruits.add(avocado4Ripe);
		fruits.add(kiwi4);
		fruits.add(kiwi);
		fruits.add(kiwiOrganic);
		fruits.add(mango2);
		fruits.add(nectarines4);
		fruits.add(papaya);
		
		fruits.add(peaches4);
		fruits.add(pears4Ready);
		fruits.add(plums5Ripe);
		fruits.add(pears4Organic);
		
		
	}
	public static List<FruitModel> getAllDummyProducts(){
		return fruits;
	}

}
