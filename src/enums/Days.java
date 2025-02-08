package enums;

public enum Days {
    NONE,
    lunes,
    martes,
    miercoles,
    jueves,
    viernes,
    sabado,
    domingo;


    public static Days getEnum(String value) {
        for (Days re : Days.values()) {
            if (re.toString().compareTo(value) == 0) {
                return re;
            }
        }
        return NONE;
    }
}
