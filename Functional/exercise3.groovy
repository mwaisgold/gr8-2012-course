//You can get stock price for a given ticker from Yahoo at 
//"http://ichart.finance.yahoo.com/table.csv?s=$ticker" 
//To get the latest price, use 

public class YahooFinance {
  public static double getPrice(final String ticker) {
      // Thread.sleep(1000)
      // ticker.inject(0) { s, e -> s + (int)(e) }

// If the internet connection is good, use the following, the above is mocking a response.
    def url = "http://ichart.finance.yahoo.com/table.csv?s=$ticker".toURL()
    // 
    def data = url.readLines()[1].split(",")
    Double.parseDouble(data[-1])
  }
}


//Given a list of ticker symbols "AAPL", "AMD", "CSCO", "GOOG", "HPQ", "INTC", "MSFT", "ORCL"
//write a program using function composition to determine the highest priced stock that is 
//less than $500 in price.

def tickers = ["AAPL", "AMD", "CSCO", "GOOG", "HPQ", "INTC", "MSFT", "ORCL", "MELI"]

//Imperative style

//Functional in 2 ways

