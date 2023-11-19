import { Artist } from "./models/artist.js";
import { Song } from "./models/song.js";
import { ArtistResource } from "./resources/artist-resource.js";
import { SongResource } from "./resources/song-resource.js";
import { LongFormView } from "./views/long-form-view.js";
import { ShortFormView } from "./views/short-form-view.js";
export class ArtistFactory {
    constructor() {
        this.artist = new Artist("Ahmed ElGarhy", "https://avatars.githubusercontent.com/u/89610486?v=4", `I'm a Full-Stack Developer who is seeking any opportunity to enhance my career and make me stand out as a Software Engineer.I'm a student of computer science.`);
    }
    createLongForm() {
        return new LongFormView(new ArtistResource(this.artist));
    }
    createShortForm() {
        return new ShortFormView(new ArtistResource(this.artist));
    }
}
export class SongFactory {
    constructor() {
        this.song = new Song("My Song", "https://www.aboutmusictheory.com/wp-content/uploads/2012/04/composing-music-verse-pop-song.jpg", "The best song ever");
    }
    createLongForm() {
        return new LongFormView(new SongResource(this.song));
    }
    createShortForm() {
        return new ShortFormView(new SongResource(this.song));
    }
}
