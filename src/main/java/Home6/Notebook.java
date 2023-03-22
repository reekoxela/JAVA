package Home6;

public class Notebook {
    private String trademark;
    private String model;
    private String cpu;
    private Integer ram;
    private String driveType;
    private Integer volumeDrive;
    private Boolean osInstalled;
    private Integer scrDiagonal;
    private Double price;

    public Notebook(String trademark, String model, String cpu, Integer ram, String driveType, Integer volumeDrive,
                    Boolean osInstalled, Integer scrDiagonal, Double price) {
        this.trademark = trademark;
        this.model = model;
        this.cpu = cpu;
        this.ram = ram;
        this.driveType = driveType;
        this.volumeDrive = volumeDrive;
        this.osInstalled = osInstalled;
        this.scrDiagonal = scrDiagonal;
        this.price = price;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public String getDriveType() {
        return driveType;
    }

    public void setDriveType(String driveType) {
        this.driveType = driveType;
    }

    public Integer getVolumeDrive() {
        return volumeDrive;
    }

    public void setVolumeDrive(Integer volumeDrive) {
        this.volumeDrive = volumeDrive;
    }

    public Boolean getOsInstalled() {
        return osInstalled;
    }

    public void setOsInstalled(Boolean osInstalled) {
        this.osInstalled = osInstalled;
    }

    public Integer getScrDiagonal() {
        return scrDiagonal;
    }

    public void setScrDiagonal(Integer scrDiagonal) {
        this.scrDiagonal = scrDiagonal;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String printInformation() {
        System.out.printf("Марка: %s, модель: %s, Процессор: %s, Объем оперативной памяти: %sГб, Тип накопителя: %s, " +
                        "Объем накопителя: %sГб, Предустановленная ОС: %s, Диагональ экрана: %s'', Цена: %sр",
                trademark,model, cpu, ram, driveType, volumeDrive, osInstalled,scrDiagonal,price);
        return ".";
    }
}
