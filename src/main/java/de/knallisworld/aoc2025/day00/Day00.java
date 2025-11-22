package de.knallisworld.aoc2025.day00;

import lombok.extern.log4j.Log4j2;

import static de.knallisworld.aoc2025.support.cli.Commons.printHeader;
import static de.knallisworld.aoc2025.support.cli.Commons.printSolution;

@Log4j2
public class Day00 {

	static void main(String[] args) {
		printHeader(00);
		printSolution(1, () -> "x");
		printSolution(2, () -> "x");
	}

}

