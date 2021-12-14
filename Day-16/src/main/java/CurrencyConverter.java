public class CurrencyConverter {
    double walletBalance;

    public double rupeesToDollar(double currencyValueInRupees) {
        return currencyValueInRupees / 74.85;
    }

    public double dollarToRupees(double currencyValueInDollar) {
        return currencyValueInDollar * 74.85;
    }

    public void addRupeesToWallet(double currencyValueInRupees) {
        if (currencyValueInRupees < 0) {
            throw new IllegalArgumentException("Cannot add negative money to wallet");
        } else {
            walletBalance += currencyValueInRupees;

        }
    }

    public void addDollarsToWallet(double currencyValueInDollars) {
        if (currencyValueInDollars < 0) {
            throw new IllegalArgumentException("Cannot add negative money to wallet");
        } else {
            walletBalance += dollarToRupees(currencyValueInDollars);
        }
    }

    public void withdrawRupeesFromWallet(double currencyValueInRupees) {
        if (currencyValueInRupees <= 0 || currencyValueInRupees > walletBalance) {
            throw new IllegalArgumentException("Cannot withdraw money from wallet");
        } else {
            walletBalance -= currencyValueInRupees;

        }

    }

    public void withdrawDollarsFromWallet(double currencyValueInDollars) {
        if (currencyValueInDollars <= 0 || currencyValueInDollars > walletBalance) {
            throw new IllegalArgumentException("Cannot withdraw money from wallet");
        } else {
            walletBalance -= dollarToRupees(currencyValueInDollars);
        }
    }

    public double getWalletBalance(String preferredCurrency) {
        if (preferredCurrency == "Rs") {
            return walletBalance;
        } else if (preferredCurrency == "$") {
            return rupeesToDollar(walletBalance);
        } else {
            throw new IllegalArgumentException("Not a valid currency type");
        }

    }

}
