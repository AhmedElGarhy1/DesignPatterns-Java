export class Song {
    constructor(name, image, description) {
        this.name = name;
        this.image = image;
        this.description = description;
    }
    setName(name) {
        this.name = name;
    }
    setImage(image) {
        this.image = image;
    }
    setDescription(description) {
        this.description = description;
    }
    getName() {
        return this.name;
    }
    getImage() {
        return this.image;
    }
    getDescription() {
        return this.description;
    }
}
