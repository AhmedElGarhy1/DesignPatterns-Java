export class Song {
  constructor(
    private name: string,
    private image: string,
    private description: string
  ) {}

  setName(name: string): void {
    this.name = name;
  }
  setImage(image: string): void {
    this.image = image;
  }
  setDescription(description: string): void {
    this.description = description;
  }
  getName(): string {
    return this.name;
  }
  getImage(): string {
    return this.image;
  }
  getDescription(): string {
    return this.description;
  }
}
