package br_ucsal.Links;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;

import org.javamoney.moneta.FastMoney;
import org.javamoney.moneta.Money;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello wolrd");
		
		CurrencyUnit usd = Monetary.getCurrency("USD");
		CurrencyUnit eur = Monetary.getCurrency("EURO");
		
		System.out.println(usd.getNumericCode());
		System.out.println(usd.getDefaultFractionDigits());
		
		MonetaryAmount amount = Monetary.getDefaultAmountFactory().setCurrency(usd).setNumber(200).create();
		
		Money money = Money.of(12,"USD");
		Money euro = Money.of(12,"EURO");
		
		FastMoney fastMoney = FastMoney.of(2, usd);
		
		System.out.println(amount);
		System.out.println(money);
		System.out.println(fastMoney);
		
		
	}

}
