package Learning;

public class Generics {
    public static void main(String[] args) {
        Result.Builder<Integer> builder = new Result.Builder<Integer>()
                .success("true");

        builder.data(10);

        Result<Integer> result = builder.build();

        ResultPrinter resultPrinter = new ResultPrinter();
        resultPrinter.printResult(result);
    }
}

class Result<T> {
    private String success;
    private T data;

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return String.format("Status: %s. Data: %s", success, data);
    }

    static class Builder<T> {
        private String success;
        private T data;

        public Builder<T> success(String success) {
            this.success = success;
            return this;
        }

        public Builder<T> data(T data) {
            this.data = data;
            return this;
        }

        public Result<T> build() {
            Result<T> result = new Result<>();
            result.setSuccess(success);
            result.setData(data);
            return result;
        }
    }
}

class ResultPrinter {
    public <T> void printResult(Result<T> result) {
        var newString = String.format("Status: %s. Data: %s", result.getSuccess(), result.getData());
        System.out.println(newString);
    }
}
