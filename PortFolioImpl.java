package com.portfolio.repo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.portfolio.entity.Portfolio;
import com.portfolio.entity.Position;

public class PortFolioImpl {
	
	private static List<Portfolio> listOfPortfolio=new ArrayList<>();
	
	
	static {
		try {
			Position pos1=new Position(1000,new SimpleDateFormat("yyy-MM-dd").parse("2020-08-23"),new SimpleDateFormat("yyy-MM-dd").parse("2021-08-23"),"BRSQE28AUS1");
			listOfPortfolio.add(new Portfolio("Portfolio-GFS-AP-AUS", -252765,"Austrelia","INDEX",pos1));
			Position pos2=new Position(1200,new SimpleDateFormat("yyy-MM-dd").parse("2020-09-01"),new SimpleDateFormat("yyy-MM-dd").parse("2021-09-13"),"BRSQE28AUS1");
			listOfPortfolio.add(new Portfolio("Portfolio-GFS-AP-AUS", -252765,"Austrelia","INDEX",pos2));
			Position pos3=new Position(1300,new SimpleDateFormat("yyy-MM-dd").parse("2020-09-11"),new SimpleDateFormat("yyy-MM-dd").parse("2021-09-13"),"BRSQE28HK1");
			listOfPortfolio.add(new Portfolio("Portfolio-GFS-AP-HK", -252766,"Hong Kong","INDEX",pos3));
			Position pos4=new Position(1400,new SimpleDateFormat("yyy-MM-dd").parse("2020-09-14"),new SimpleDateFormat("yyy-MM-dd").parse("2021-09-18"),"BRSQE28IND1");
			listOfPortfolio.add(new Portfolio("Portfolio-GFS-AP-IND", -252769," INDIA","INDEX",pos4));
			Position pos5=new Position(1400,new SimpleDateFormat("yyy-MM-dd").parse("2020-10-14"),new SimpleDateFormat("yyy-MM-dd").parse("2021-10-18"),"BRSQE28IND1");
			listOfPortfolio.add(new Portfolio("Portfolio-GFS-AP-IND", -252769," INDIA","INDEX",pos5));
			Position pos6=new Position(1800,new SimpleDateFormat("yyy-MM-dd").parse("2020-09-21"),new SimpleDateFormat("yyy-MM-dd").parse("2021-09-23"),"BRSQE28HK1");
			listOfPortfolio.add(new Portfolio("Portfolio-GFS-AP-HK", -252766,"Hong Kong","INDEX",pos6));
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
