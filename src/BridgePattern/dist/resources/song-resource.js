export class SongResource {
    constructor(song) {
        this.song = song;
    }
    snippet() {
        return this.song.getDescription();
    }
    name() {
        return this.song.getName();
    }
    image() {
        return this.song.getImage();
    }
}
