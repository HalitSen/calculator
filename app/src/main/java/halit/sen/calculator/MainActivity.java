package halit.sen.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.zero_tv)
    TextView oneText;
    @BindView(R.id.one_tv)
    TextView zeroText;
    @BindView(R.id.two_tv)
    TextView twoText;
    @BindView(R.id.three_tv)
    TextView threeText;
    @BindView(R.id.four_tv)
    TextView fourText;
    @BindView(R.id.five_tv)
    TextView fiveText;
    @BindView(R.id.six_tv)
    TextView sixText;
    @BindView(R.id.seven_tv)
    TextView sevenText;
    @BindView(R.id.eight_tv)
    TextView eightText;
    @BindView(R.id.nine_tv)
    TextView nineText;
    @BindView(R.id.delete_tv)
    TextView deleteText;
    @BindView(R.id.add_tv)
    TextView addText;
    @BindView(R.id.minus_tv)
    TextView nminusText;
    @BindView(R.id.multiply_tv)
    TextView multiplyText;
    @BindView(R.id.division_tv)
    TextView divisionText;
    @BindView(R.id.equal_tv)
    TextView equalText;
    @BindView(R.id.input_tv)
    TextView inputText;
    @BindView(R.id.result_tv)
    TextView resultText;
    private double number1 = 0.0;
    private double number2 = 0.0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.zero_tv, R.id.one_tv, R.id.two_tv, R.id.three_tv, R.id.four_tv, R.id.five_tv, R.id.six_tv, R.id.seven_tv,
            R.id.eight_tv, R.id.nine_tv, R.id.add_tv, R.id.minus_tv, R.id.multiply_tv, R.id.division_tv, R.id.equal_tv, R.id.delete_tv})
    public void onViewClicked(View view) {

        switch (view.getId()) {

            case R.id.zero_tv:

                inputText.setText(inputText.getText().toString() + "0");

                break;

            case R.id.one_tv:

                inputText.setText(inputText.getText().toString() + "1");

                break;

            case R.id.two_tv:

                inputText.setText(inputText.getText().toString() + "2");

                break;

            case R.id.three_tv:

                inputText.setText(inputText.getText().toString() + "3");

                break;

            case R.id.four_tv:

                inputText.setText(inputText.getText().toString() + "4");

                break;

            case R.id.five_tv:

                inputText.setText(inputText.getText().toString() + "5");

                break;

            case R.id.six_tv:

                inputText.setText(inputText.getText().toString() + "6");

                break;

            case R.id.seven_tv:

                inputText.setText(inputText.getText().toString() + "7");

                break;

            case R.id.eight_tv:

                inputText.setText(inputText.getText().toString() + "8");

                break;

            case R.id.nine_tv:

                inputText.setText(inputText.getText().toString() + "9");

                break;

            case R.id.add_tv:

                if (resultText.getText().toString().isEmpty()) {

                    if (inputText.getText().toString().isEmpty()) {
                        number1 = 0.0;
                        //TODO toast  nothing to add
                    } else {
                        number1 = Double.parseDouble(inputText.getText().toString());
                        resultText.setText(inputText.getText().toString() + " +");
                        inputText.setText(null);
                    }

                } else if (isResultHasOperator(resultText)) {

                    String temp = resultText.getText().toString();
                    StringBuilder sb = new StringBuilder(temp);
                    sb.deleteCharAt(temp.length() - 1);
                    String newStr = sb.toString();
                    newStr = newStr.trim();
                    newStr = newStr + " +";
                    resultText.setText(newStr);

                } else {
                    number1 = Double.parseDouble(resultText.getText().toString());
                    resultText.setText(resultText.getText().toString() + " +");
                    inputText.setText(null);
                }

                break;

            case R.id.minus_tv:

                if (resultText.getText().toString().isEmpty()) {

                    if (inputText.getText().toString().isEmpty()) {
                        number1 = 0.0;
                    } else {
                        number1 = Double.parseDouble(inputText.getText().toString());
                        resultText.setText(inputText.getText().toString() + " -");
                        inputText.setText(null);
                    }

                } else if (isResultHasOperator(resultText)) {

                    //TODO bu operator + değilse + yap
                    String temp = resultText.getText().toString();
                    StringBuilder sb = new StringBuilder(temp);
                    sb.deleteCharAt(temp.length() - 1);
                    String newStr = sb.toString();
                    newStr = newStr.trim();
                    newStr = newStr + " -";
                    resultText.setText(newStr);

                } else {
                    number1 = Double.parseDouble(resultText.getText().toString());
                    resultText.setText(resultText.getText().toString() + " -");
                    inputText.setText(null);
                }

                break;

            case R.id.division_tv:

                if (resultText.getText().toString().isEmpty()) {

                    if (inputText.getText().toString().isEmpty()) {
                        number1 = 0.0;
                    } else {
                        number1 = Double.parseDouble(inputText.getText().toString());
                        resultText.setText(inputText.getText().toString() + " ÷");
                        inputText.setText(null);
                    }

                } else if (isResultHasOperator(resultText)) {
                    String temp = resultText.getText().toString();
                    StringBuilder sb = new StringBuilder(temp);
                    sb.deleteCharAt(temp.length() - 1);
                    String newStr = sb.toString();
                    newStr = newStr.trim();
                    newStr = newStr + " ÷";
                    resultText.setText(newStr);

                } else {
                    number1 = Double.parseDouble(resultText.getText().toString());
                    resultText.setText(resultText.getText().toString() + " ÷");
                    inputText.setText(null);
                }

                break;

            case R.id.multiply_tv:

                if (resultText.getText().toString().isEmpty()) {

                    if (inputText.getText().toString().isEmpty()) {
                        number1 = 0.0;
                    } else {
                        number1 = Double.parseDouble(inputText.getText().toString());
                        resultText.setText(inputText.getText().toString() + " *");
                        inputText.setText(null);
                    }

                } else if (isResultHasOperator(resultText)) {

                    String temp = resultText.getText().toString();
                    StringBuilder sb = new StringBuilder(temp);
                    sb.deleteCharAt(temp.length() - 1);
                    String newStr = sb.toString();
                    newStr = newStr.trim();
                    newStr = newStr + " *";
                    resultText.setText(newStr);

                } else {
                    number1 = Double.parseDouble(resultText.getText().toString());
                    resultText.setText(resultText.getText().toString() + " *");
                    inputText.setText(null);
                }

                break;

            case R.id.equal_tv:

                if (inputText.getText().toString().isEmpty() || resultText.getText().toString().isEmpty()) {

                    //TODO toast  nothing to calculate

                } else {

                    number2 = Double.parseDouble(inputText.getText().toString());

                    Character operation = resultText.getText().charAt(resultText.getText().length() - 1);

                    calculate(operation, number1, number2);

                }

                break;

            case R.id.delete_tv:

                //TODO eğer input boşsa resultu da temizlesin. input boş değilse tek tek inputu basamak basamak silsin.
                // input temizlenirse eğer resultu da silsin

                inputText.setText(null);
                resultText.setText(null);
                break;
        }
    }

    private void calculate(Character operation, Double num1, Double num2) {

        //TODO diğer işlemleri yapınca burayı switch case e al
        if (operation == '+') {

            Double result = num1 + num2;

            resultText.setText(result.toString());
            inputText.setText(null);


            String temp = resultText.getText().toString();

            StringBuilder sb = new StringBuilder(temp);

            sb.deleteCharAt(temp.length() - 1);

            String newStr = sb.toString();

            newStr = newStr.trim();

            number1 = Double.parseDouble(newStr);

        } else if (operation == '-') {
            Double result = num1 - num2;

            resultText.setText(result.toString());
            inputText.setText(null);


            String temp = resultText.getText().toString();

            StringBuilder sb = new StringBuilder(temp);

            sb.deleteCharAt(temp.length() - 1);

            String newStr = sb.toString();

            newStr = newStr.trim();

            number1 = Double.parseDouble(newStr);
        }
        else if(operation =='÷'){
            Double result = num1 / num2;

            resultText.setText(result.toString());
            inputText.setText(null);

            String temp = resultText.getText().toString();

            StringBuilder sb = new StringBuilder(temp);

            sb.deleteCharAt(temp.length() - 1);

            String newStr = sb.toString();

            newStr = newStr.trim();

            number1 = Double.parseDouble(newStr);

        }else if(operation =='*'){
            Double result = num1 * num2;

            resultText.setText(result.toString());
            inputText.setText(null);

            String temp = resultText.getText().toString();

            StringBuilder sb = new StringBuilder(temp);

            sb.deleteCharAt(temp.length() - 1);

            String newStr = sb.toString();

            newStr = newStr.trim();

            number1 = Double.parseDouble(newStr);
        }
    }

    private boolean isResultHasOperator(TextView result){

        switch (result.getText().charAt(result.getText().length()-1)){

            case '+':
                return true;

            case '-':
                return true;

            case '*':
                return true;

            case '÷':
                return true;
            default:
                return false;
        }
    }


    private char getOperator(TextView resultText){

       char op = resultText.getText().charAt(resultText.getText().length() - 1);

       switch (op){
           case '+':
               return '+';
           case '*':
               return '*';
           case '-':
               return '-';
           case '÷':
               return '÷';
               default:
                   return '+';
       }
    }
}
