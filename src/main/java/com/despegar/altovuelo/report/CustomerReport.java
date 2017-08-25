package com.despegar.altovuelo.report;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author draffaeli
 *
 */
public class CustomerReport {

	private List<CustomerReportLine> lines = new ArrayList<>();

	public List<CustomerReportLine> getLines() {
		return lines;
	}

	public void addLine(CustomerReportLine line) {
		this.lines.add(line);
	}

	@Override
	public String toString() {
		return "CustomerReport [lines=" + lines + "]";
	}
	
}
