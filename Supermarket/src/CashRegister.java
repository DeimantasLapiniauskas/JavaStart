import java.util.Map;


public class CashRegister {
    private final Map<Double, Integer> moneyMap;

    public CashRegister(Map<Double, Integer> list) {
        moneyMap = list;
    }

    public void addCoin(double coin) {
        moneyMap.put(coin, moneyMap.getOrDefault(coin, 0) + 1);
    }

    public String getCoinList() {
        StringBuilder output = new StringBuilder("Cash Inventory:\n");
        moneyMap.forEach((key, value) -> output.append("Value: ").append(key).append(", quantity: ").append(value).append("\n"));
        return output.toString();
    }

    public void giveChange(double amount) {
        int coinAmount = 0;
        for (Map.Entry<Double, Integer> entry : moneyMap.entrySet()) {
            double value = entry.getValue();
            coinAmount = (int) (amount / entry.getKey());
            System.err.println("key: " + entry.getKey());
            System.err.println("value: " + entry.getValue());
            System.err.println("-=-=-=---=-=-=-=-=-=-=-=-");

            System.out.println("Value: " + value + ", quantity: " + coinAmount);
            if (amount == 0) break;

            if(value - coinAmount > 0){
                moneyMap.replace(entry.getKey(), (int) (value - coinAmount));
            }
            else {
                coinAmount = (int) value;
                moneyMap.replace(entry.getKey(), 0);
            }
            amount = Math.round(amount- coinAmount * entry.getKey()*100.0)/100.0;
        }
        if (amount > 0){
            throw new NotEnoughChangeException(amount);
        }
    }
}