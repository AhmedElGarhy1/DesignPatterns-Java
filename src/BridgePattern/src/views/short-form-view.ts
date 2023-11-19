import { IResource } from "../resources/resource.interface";
import { IView } from "./view.interface";

export class ShortFormView implements IView {
  constructor(private readonly resource: IResource) {}

  display(): string {
    return `
        <div style="margin: 10px 30%; background: #eee; text-align: center"> 
          <h1>hello this is Short form view</h1>
          <h3>the name is ${this.resource.name()}</h3>
          <img width="300px" src="${this.resource.image()}" />
          <p>the snippet is ${this.resource.snippet()}</p>
        </div>
    `;
  }
}
