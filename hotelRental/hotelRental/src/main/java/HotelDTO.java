import com.rentalHotel.domain.Hotel;


public class HotelDTO {
    private String name;
    private String location;
    private double price;

    public static HotelDTO fromEntity(Hotel hotel) {
        HotelDTO dto = new HotelDTO();
        dto.name = hotel.getName();
        dto.location = hotel.getLocation();
        dto.price = hotel.getPrice();
        return dto;
    }

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

    
}
