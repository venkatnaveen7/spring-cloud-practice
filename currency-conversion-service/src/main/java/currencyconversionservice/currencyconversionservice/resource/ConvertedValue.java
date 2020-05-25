package currencyconversionservice.currencyconversionservice.resource;

import java.math.BigDecimal;

public class ConvertedValue {
	
	private String from;
	private String to;
	private BigDecimal conversionRate;
	private BigDecimal units;
	public void setUnits(BigDecimal units) {
		this.units = units;
	}
	private BigDecimal convrtedValue;
	private int port;
	public ConvertedValue(String from, String to, BigDecimal conversionRate, BigDecimal units, BigDecimal convrtedValue,
			int port) {
		super();
		this.from = from;
		this.to = to;
		this.conversionRate = conversionRate;
		this.units = units;
		this.convrtedValue = convrtedValue;
		this.port = port;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getConversionRate() {
		return conversionRate;
	}
	public void setConversionRate(BigDecimal conversionRate) {
		this.conversionRate = conversionRate;
	}
	  
	public BigDecimal getConvrtedValue() {
		return convrtedValue;
	}
	public void setConvrtedValue(BigDecimal convrtedValue) {
		this.convrtedValue = convrtedValue;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	

}
