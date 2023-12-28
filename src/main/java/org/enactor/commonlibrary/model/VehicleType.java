package org.enactor.commonlibrary.model;

public enum VehicleType
{
    BUS("B","bus"),
    VAN("V","van"),
    TRAIN("T","train");

    private final String code;
    private final String name;

    VehicleType(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }


    /**
     * This method is used to get the value of the VehicleType enum for the user given vehicle type
     *
     * @param vehicleType type of the vehicle(Bus,Van.Train etc)
     * @return the relevant value in the Enum VehicleType
     */
    public static VehicleType getVehicleType(String vehicleType)
    {

        switch (vehicleType.toLowerCase())
        {
            case ("bus"):
                return VehicleType.BUS;
            case "van":
                return VehicleType.VAN;
            default:
                return null;
        }
    }
}
