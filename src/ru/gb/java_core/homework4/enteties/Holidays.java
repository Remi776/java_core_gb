package ru.gb.java_core.homework4.enteties;

public enum Holidays {
    NO_HOLIDAY("Нет праздника"),
    NEW_YEAR("Новый год"),
    WOMENS_DAY("8 марта"),
    DEFENDERS_DAY("23 февраля");

    private final String fullName;

    Holidays(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }
}
