import { SongFactory } from "./factory.js";
function main() {
    // const factory: IViewFactory = new ArtistFactory();
    const factory = new SongFactory();
    // const view = factory.createLongForm();
    const view = factory.createShortForm();
    const html = view.display();
    document.getElementById("root").innerHTML = html;
}
main();
