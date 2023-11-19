export class Artist {
  constructor(
    private name: string,
    private image: string,
    private bio: string
  ) {}

  setName(name: string): void {
    this.name = name;
  }
  setImage(image: string): void {
    this.image = image;
  }
  setBio(bio: string): void {
    this.bio = bio;
  }
  getName(): string {
    return this.name;
  }
  getImage(): string {
    return this.image;
  }
  getBio(): string {
    return this.bio;
  }
}
