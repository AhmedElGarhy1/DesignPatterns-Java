export class LongFormView {
    constructor(resource) {
        this.resource = resource;
    }
    display() {
        return `
        <div style="margin: 10px 100px; background: #eee; text-align: center"> 
          <h1>hello this is Long form view</h1>
          <h3>the name is ${this.resource.name()}</h3>
          <img width="700px" src="${this.resource.image()}" />
          <p>the snippet is ${this.resource.snippet()}</p>
        </div>
    `;
    }
}
