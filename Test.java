import lombok.*;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        //System.out.println(isActivePosition(getDate("2020-09-21"), getDate("2020-09-22")));
        List<Portfolio> list = getPortfolioList();
        Map<String, List<String>> result = new LinkedHashMap<>();


        for (Portfolio portfolio : list) {
            List<Position> positions = portfolio.getPosition();
            List<String> cusipList = new ArrayList<>();
            for (Position position : positions) {
                if (isActivePosition(position.getStartDate(), position.getEndDate())) {
                    if(cusipList.isEmpty()) {
                        cusipList.add(position.getCusip());
                        result.put(portfolio.getFullName(), cusipList);
                    } else {
                        List<String> cups = result.get(portfolio.getFullName());
                        cups.add(position.getCusip());
                        result.put(portfolio.getFullName(), cups.stream().distinct().collect(Collectors.toList()));
                    }
                }
            }
        }

        System.out.println(result);
    }


    private static boolean isActivePosition(Date startDate, Date endDate) {
        return currentDate().equals(endDate)
                || (currentDate().before(endDate)
                && (currentDate().after(startDate) || currentDate().equals(startDate)));
    }

    public static List<Portfolio> getPortfolioList() {
        List<Portfolio> listOfPortfolio = new ArrayList<>();
        Position pos1 = new Position(1000, getDate("2019-08-23"), getDate("2020-09-22"), "BRSQE28AUS1");
        Position pos2 = new Position(1200, getDate("2020-09-01"), getDate("2021-09-13"), "BRSQE28AUS2");
        Position pos7 = new Position(1300, getDate("2020-09-02"), getDate("2021-09-25"), "BRSQE28AUS2");
        Portfolio portfolio_aus = new Portfolio("Portfolio-GFS-AP-AUS", -252765, "Austrelia", "INDEX",
                Arrays.asList(pos1, pos2, pos7));


        Position pos3 = new Position(1300, getDate("2020-09-11"), getDate("2021-09-13"), "BRSQE28HK1");
        Position pos6 = new Position(1800, getDate("2020-09-21"), getDate("2021-09-23"), "BRSQE28HK1");
        Portfolio portfolio_hongKong = new Portfolio("Portfolio-GFS-AP-HK", -252766, "Hong Kong", "INDEX",
                Arrays.asList(pos3, pos6));


        Position pos4 = new Position(1400, getDate("2020-09-14"), getDate("2021-09-18"), "BRSQE28IND1");
        Position pos5 = new Position(1400, getDate("2020-10-14"), getDate("2021-10-18"), "BRSQE28IND1");

        Portfolio portfolio_india = new Portfolio("Portfolio-GFS-AP-IND", -252769, " INDIA", "INDEX",
                Arrays.asList(pos4,
                        pos5));

        listOfPortfolio.add(portfolio_aus);
        listOfPortfolio.add(portfolio_hongKong);
        listOfPortfolio.add(portfolio_india);

        return listOfPortfolio;
    }


    @SneakyThrows
    public static Date getDate(String date) {
        return new SimpleDateFormat("yyyy-MM-dd").parse(date);
    }

    @SneakyThrows
    public static Date currentDate() {
        return getDate(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
    }
}

@Getter
@Setter
@ToString
@AllArgsConstructor
class Position {
    private int fund;
    private Date startDate;
    private Date endDate;
    private String cusip;
}

@Getter
@Setter
@ToString
@AllArgsConstructor
class Portfolio {
    private String name;
    private int code;
    private String fullName;
    private String type;
    private List<Position> position;
}
