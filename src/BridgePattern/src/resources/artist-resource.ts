import { Artist } from "../models/artist";
import { IResource } from "./resource.interface";

export class ArtistResource implements IResource {
  constructor(private readonly artist: Artist) {}

  snippet(): string {
    return this.artist.getBio();
  }
  name(): string {
    return this.artist.getName();
  }
  image(): string {
    return this.artist.getImage();
  }
}
