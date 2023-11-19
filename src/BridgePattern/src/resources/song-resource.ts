import { Song } from "../models/song";
import { IResource } from "./resource.interface";

export class SongResource implements IResource {
  constructor(private readonly song: Song) {}

  snippet(): string {
    return this.song.getDescription();
  }
  name(): string {
    return this.song.getName();
  }
  image(): string {
    return this.song.getImage();
  }
}
