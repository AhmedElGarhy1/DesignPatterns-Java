export class ArtistResource {
    constructor(artist) {
        this.artist = artist;
    }
    snippet() {
        return this.artist.getBio();
    }
    name() {
        return this.artist.getName();
    }
    image() {
        return this.artist.getImage();
    }
}
