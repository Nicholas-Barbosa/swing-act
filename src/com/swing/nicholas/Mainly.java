package com.swing.nicholas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Mainly {

	private static JFrame frame = new JFrame();

	public static void main(String[] args) {

		var varargs = new Integer[21];
		int i = 1;
		while (i <= 20) {
			varargs[i] = Integer.valueOf(JOptionPane.showInputDialog(frame, "Number " + i + " of " + 20));
			i++;
		}

		varargs = Arrays.asList(varargs).parallelStream().filter(x -> x != null).distinct().collect(Collectors.toList())
				.toArray(new Integer[0]);

		showResultDesc(varargs);
		showResultAsc(varargs);

		System.exit(500);
	}

	@SafeVarargs
	private static void showResultDesc(Integer... varargs) {
		Arrays.sort(varargs);
		JOptionPane.showMessageDialog(frame, "Numbers in ascending order " + Arrays.toString(varargs));

	}

	@SafeVarargs
	private static void showResultAsc(Integer... varargs) {
		Arrays.sort(varargs, Comparator.reverseOrder());
		JOptionPane.showMessageDialog(frame, "Numbers in descending order " + Arrays.toString(varargs));
	}

}
