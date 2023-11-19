export class Artist {
    constructor(name, image, bio) {
        this.name = name;
        this.image = image;
        this.bio = bio;
    }
    setName(name) {
        this.name = name;
    }
    setImage(image) {
        this.image = image;
    }
    setBio(bio) {
        this.bio = bio;
    }
    getName() {
        return this.name;
    }
    getImage() {
        return this.image;
    }
    getBio() {
        return this.bio;
    }
}
