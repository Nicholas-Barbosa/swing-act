package com.swing.nicholas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Mainly {

	private static JFrame frame = new JFrame();

	public static void main(String[] args) {

		var varargs = new String[21];
		int i = 1;
		while (i <= 20) {
			varargs[i] = JOptionPane.showInputDialog(frame, "Ur text " + i + " of " + 4 + ":");
			i++;
		}

		varargs = Arrays.asList(varargs).stream().map(x -> x == null ? "0" : x).collect(Collectors.toList())
				.toArray(new String[0]);

		showResultDesc(varargs);
		showResultAsc(varargs);
	}

	@SafeVarargs
	private static void showResultDesc(String... varargs) {
		Arrays.sort(varargs);
		JOptionPane.showMessageDialog(frame, "Text in descending order " + Arrays.toString(varargs));
	}

	@SafeVarargs
	private static void showResultAsc(String... varargs) {
		Arrays.sort(varargs, Comparator.reverseOrder());
		JOptionPane.showMessageDialog(frame, "Text in ascending order " + Arrays.toString(varargs));
	}
}
