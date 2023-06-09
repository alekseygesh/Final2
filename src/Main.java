import com.sun.xml.internal.ws.util.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        //чтение в буфер введенного значения
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        //регулярка на проверку, число или нет
        String reg = "^[0-9|x][+|-][0-9|x][=][0-9|x]$";

        String equation;
        do {
            System.out.println("Введите уравнение: ");
            equation = buffer.readLine();
        } while (!(equation.matches(reg)));
        String[] myEquation = equation.split("");
        System.out.println(Arrays.toString(myEquation));

        if(myEquation[0].equals("x")){
            if(myEquation[1].equals("-")){
                System.out.println("Вывод: " + (Integer.parseInt(myEquation[4]) + Integer.parseInt(myEquation[2])));
            }
            else{
                System.out.println("Вывод: " + (Integer.parseInt(myEquation[4]) - Integer.parseInt(myEquation[2])));
            }
        }
        else if(myEquation[2].equals("x")){
            if(myEquation[1].equals("-")){
                System.out.println("Вывод: " + (Integer.parseInt(myEquation[0]) - Integer.parseInt(myEquation[4])));
            }
            else{
                System.out.println("Вывод: " + (Integer.parseInt(myEquation[4]) - Integer.parseInt(myEquation[0])));
            }

        }
        else{
            if(myEquation[1].equals("-")){
                System.out.println("Вывод: " + (Integer.parseInt(myEquation[0]) - Integer.parseInt(myEquation[2])));
            }
            else{
                System.out.println("Вывод: " + (Integer.parseInt(myEquation[0]) + Integer.parseInt(myEquation[2])));
            }
        }
    }
}