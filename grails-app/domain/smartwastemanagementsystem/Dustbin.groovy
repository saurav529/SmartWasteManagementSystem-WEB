package smartwastemanagementsystem

class Dustbin {
    double latitude
    double longitude
    String address

    static constraints = {
        latitude(blank: true, nullable: false)
        longitude(blank: true, nullable: false)
        address(blank: true, nullable: false)
    }
}
