package edu.academy.fourthhomework.calculator;

public class CalculatorWithCounter implements ICalculator {
        private ICalculator calc;
        private int count;// инициация счетчика
        public int getCount() {

        return count;
    }
        public CalculatorWithCounter(ICalculator calcWithMath){
            this.calc = calcWithMath;
        }

        @Override
        public double plus(double a, double b) {
            count++;// счетчик
            return calc.plus(a,b);
        }


        @Override
        public double minus(double a, double b) {
            count++;// счетчик
            return calc.minus(a,b);
        }

        @Override
        public double umno(double a, double b) {
            count++;// счетчик
            return calc.umno(a,b);
        }

        @Override
        public double del(double a, double b) {
            count++;// счетчик
            return calc.del(a,b);
        }

        @Override
        public double power(double a, double b) {
            count++;// счетчик
            return calc.power(a,b);
        }

    @Override
    public double ABS(double a) {
        return 0;
    }

    @Override
    public double sqrt(double a) {
        return 0;
    }
}


