package Task6;

public interface BaseConverter {
    abstract double convert(double temperature);
}

class converterToKelvin implements BaseConverter{
    @Override
    public double convert(double temperature) {
        return temperature + 273.15;
    }
}

class converterToFarenheit implements BaseConverter{
    @Override
    public double convert(double temperature) {
        return temperature*1.8+32;
    }
}

