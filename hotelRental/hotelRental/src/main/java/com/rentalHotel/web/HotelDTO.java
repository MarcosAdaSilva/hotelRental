package com.rentalHotel.web;

import com.rentalHotel.domain.Hotel;

public class HotelDTO {
    private String name;
    private String location;
    private double price;
    private int availableRooms;

    // Getters e setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAvailableRooms() {
        return availableRooms;
    }

    public void setAvailableRooms(int availableRooms) {
        this.availableRooms = availableRooms;
    }

    // Método de conversão de entidade para DTO
    public static HotelDTO fromEntity(Hotel hotel) {
        HotelDTO dto = new HotelDTO();
        dto.setName(hotel.getName());
        dto.setLocation(hotel.getLocation());
        dto.setPrice(hotel.getPrice());
        dto.setAvailableRooms(hotel.getAvailableRooms());
        return dto;
    }
}
