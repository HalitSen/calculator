package halit.sen.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

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
    @BindView(R.id.square_root_tv)
    TextView quareRootText;
    private double number1 = 0.0;
    private double number2 = 0.0;
    private boolean isSquareRoot = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.zero_tv, R.id.one_tv, R.id.two_tv, R.id.three_tv, R.id.four_tv, R.id.five_tv, R.id.six_tv, R.id.seven_tv,
            R.id.eight_tv, R.id.nine_tv, R.id.add_tv, R.id.minus_tv, R.id.multiply_tv, R.id.division_tv, R.id.equal_tv, R.id.delete_tv, R.id.square_root_tv})
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

                if (!isSquareRoot) {
                    if (resultText.getText().toString().isEmpty()) {

                        if (inputText.getText().toString().isEmpty()) {
                            number1 = 0.0;
                            // do nothing
                        } else {
                            number1 = Double.parseDouble(inputText.getText().toString());
                            resultText.setText(inputText.getText().toString() + " +");
                            inputText.setText(null);
                        }
                    } else if (isResultHasOperator(resultText)) {
                        resultText.setText(updateResultText(resultText) + " +");
                    } else {
                        number1 = Double.parseDouble(resultText.getText().toString());
                        resultText.setText(resultText.getText().toString() + " +");
                        inputText.setText(null);
                    }
                } else {
                    // do nothing
                }
                break;

            case R.id.minus_tv:

                if (!isSquareRoot) {
                    if (resultText.getText().toString().isEmpty()) {
                        if (inputText.getText().toString().isEmpty()) {
                            number1 = 0.0;
                        } else {
                            number1 = Double.parseDouble(inputText.getText().toString());
                            resultText.setText(inputText.getText().toString() + " -");
                            inputText.setText(null);
                        }
                    } else if (isResultHasOperator(resultText)) {
                        resultText.setText(updateResultText(resultText) + " -");
                    } else {
                        number1 = Double.parseDouble(resultText.getText().toString());
                        resultText.setText(resultText.getText().toString() + " -");
                        inputText.setText(null);
                    }
                } else {
                    // do nothing
                }
                break;

            case R.id.division_tv:

                if (!isSquareRoot) {
                    if (resultText.getText().toString().isEmpty()) {
                        if (inputText.getText().toString().isEmpty()) {
                            number1 = 0.0;
                        } else {
                            number1 = Double.parseDouble(inputText.getText().toString());
                            resultText.setText(inputText.getText().toString() + " ÷");
                            inputText.setText(null);
                        }
                    } else if (isResultHasOperator(resultText)) {
                        resultText.setText(updateResultText(resultText) + " ÷");
                    } else {
                        number1 = Double.parseDouble(resultText.getText().toString());
                        resultText.setText(resultText.getText().toString() + " ÷");
                        inputText.setText(null);
                    }
                } else {
                    // do nothing
                }
                break;

            case R.id.multiply_tv:

                if (!isSquareRoot) {
                    if (resultText.getText().toString().isEmpty()) {
                        if (inputText.getText().toString().isEmpty()) {
                            number1 = 0.0;
                        } else {
                            number1 = Double.parseDouble(inputText.getText().toString());
                            resultText.setText(inputText.getText().toString() + " *");
                            inputText.setText(null);
                        }
                    } else if (isResultHasOperator(resultText)) {
                        resultText.setText(updateResultText(resultText) + " *");
                    } else {
                        number1 = Double.parseDouble(resultText.getText().toString());
                        resultText.setText(resultText.getText().toString() + " *");
                        inputText.setText(null);
                    }
                } else {
                    // do nothing
                }
                break;

            case R.id.equal_tv:

                if (isSquareRoot) {
                    String temp = inputText.getText().toString();
                    StringBuilder sb = new StringBuilder(temp);
                    sb.deleteCharAt(0);
                    String newStr = sb.toString();
                    Double num = Double.parseDouble(newStr);
                    num = (Math.sqrt(num));
                    resultText.setText(String.valueOf(num));
                    inputText.setText(null);

                } else {
                    if (inputText.getText().toString().isEmpty() || resultText.getText().toString().isEmpty()) {
                        Toast.makeText(this, "Nothing to calculate", Toast.LENGTH_SHORT).show();
                    } else {
                        number2 = Double.parseDouble(inputText.getText().toString());
                        Character operation = resultText.getText().charAt(resultText.getText().length() - 1);
                        calculate(operation, number1, number2);
                    }
                }
                isSquareRoot = false;
                break;

            case R.id.delete_tv:

                if(inputText.getText().toString().isEmpty()){
                resultText.setText(null);
                }else if(inputText.getText().toString().length()>0){
                    CharSequence name = inputText.getText().toString();
                    inputText.setText(name.subSequence(0, name.length()-1));
                }else{
                    inputText.setText(null);
                }
                isSquareRoot = false;
                break;

            case R.id.square_root_tv:

                if (!inputText.getText().toString().isEmpty()) {
                    if (inputText.getText().charAt(0) != '√') {
                        resultText.setText(null);
                        inputText.setText("√");
                    } else {
                        // do nothing
                    }
                } else {
                    inputText.setText("√");
                    resultText.setText(null);
                }
                isSquareRoot = true;
                break;
            default:
                break;
        }
    }

    private void calculate(Character operation, Double num1, Double num2) {

        Double result = 0.0;

        switch (operation) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '÷':
                result = num1 / num2;
                break;

            default:
                break;
        }
        number1 = Double.parseDouble(saveNumberOne(resultText));
        resultText.setText(result.toString());
        inputText.setText(null);
    }

    private boolean isResultHasOperator(TextView result) {

        switch (result.getText().charAt(result.getText().length() - 1)) {

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

    private String saveNumberOne(TextView result) {
        String temp = result.getText().toString();
        StringBuilder sb = new StringBuilder(temp);
        sb.deleteCharAt(temp.length() - 1);
        String number = sb.toString();
        number = number.trim();
        return number;
    }

    private String updateResultText(TextView result) {
        String temp = result.getText().toString();
        StringBuilder sb = new StringBuilder(temp);
        sb.deleteCharAt(temp.length() - 1);
        String newStr = sb.toString();
        return newStr.trim();
    }
}
