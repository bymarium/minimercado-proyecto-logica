package minimercado.com.co.utils;

import javax.swing.JOptionPane;
public class Misc {
    public static Integer getInteger(String text) {
        try {
            return Integer.parseInt(JOptionPane.showInputDialog(text));
        } catch (Exception exception) {
            showMessage("El valor ingresado es incorrecto");
            return getInteger(text);
        }
    }

    public static Integer getIntegerGreaterThan0(String text) {
        try {
            Integer data = Integer.parseInt(JOptionPane.showInputDialog(text));

            if (data <= 0) {
                showMessage("El numero debe ser mayor que 0");
                return getIntegerGreaterThan0(text);
            }
            return data;
        } catch (Exception exception) {
            showMessage("El valor ingresado es incorrecto");
            return getIntegerGreaterThan0(text);
        }
    }

    public static Integer getIntegerSmallerThan0(String text) {
        try {
            Integer data = Integer.parseInt(JOptionPane.showInputDialog(text));

            if (data >= 0) {
                showMessage("El numero debe ser menor que 0");
                return getIntegerSmallerThan0(text);
            }
            return data;
        } catch (Exception exception) {
            showMessage("El valor ingresado es incorrecto");
            return getIntegerSmallerThan0(text);
        }
    }

    public static Float getFloat(String text) {
        try {
            return Float.parseFloat(JOptionPane.showInputDialog(text));
        } catch (Exception exception) {
            showMessage("El valor ingresado es incorrecto");
            return getFloat(text);
        }
    }

    public static Float getFloatGreaterThan0(String text) {
        try {
            Float data = Float.parseFloat(JOptionPane.showInputDialog(text));

            if (data <= 0) {
                showMessage("El numero debe ser mayor que 0");
                return getFloatGreaterThan0(text);
            }
            return data;
        } catch (Exception exception) {
            showMessage("El valor ingresado es incorrecto");
            return getFloatGreaterThan0(text);
        }
    }

    public static Float getFloatSmallerThan0(String text) {
        try {
            Float data = Float.parseFloat(JOptionPane.showInputDialog(text));

            if (data >= 0) {
                showMessage("El numero debe ser menor que 0");
                return getFloatSmallerThan0(text);
            }
            return data;
        } catch (Exception exception) {
            showMessage("El valor ingresado es incorrecto");
            return getFloatSmallerThan0(text);
        }
    }

    public static String getString(String text) {
        return JOptionPane.showInputDialog(text);
    }

    public static void showMessage(String text) {
        JOptionPane.showMessageDialog(null, text);
    }
}