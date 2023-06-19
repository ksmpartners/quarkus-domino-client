import { LitElement, html, css} from 'lit';
import { pages } from 'build-time-data';
import 'qwc/qwc-extension-link.js';

export class QwcDominoCard extends LitElement {

    static styles = css`
      .identity {
        display: flex;
        justify-content: flex-start;
      }

      .description {
        padding-bottom: 10px;
      }

      .logo {
        padding-bottom: 10px;
        margin-right: 5px;
      }

      .card-content {
        color: var(--lumo-contrast-90pct);
        display: flex;
        flex-direction: column;
        justify-content: flex-start;
        padding: 2px 2px;
        height: 100%;
      }

      .card-content slot {
        display: flex;
        flex-flow: column wrap;
        padding-top: 5px;
      }
    `;

    static properties = {
        _dialogOpened: {state: true},
        name: {type: String},
        namespace: {type: String},
        description: {type: String},
        guide: {type: String},
        clazz: {type: String},
        artifact: {type: String},
        shortName: {type: String},
        keywords: {},
        status: {type: String},
        configFilter: {},
        categories: {},
        unlisted: {type: String},
        builtWith: {type: String},
        providesCapabilities: {},
        extensionDependencies: {},    
    };

    constructor() {
        super();
    }

    connectedCallback() {
        super.connectedCallback();
    }

    render() {
        return html`<div class="card-content" slot="content">
            <div class="identity">
                <div class="logo">
                    <img src="data:image/webp;base64,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"
                                       alt="${this.name}" 
                                       title="${this.name}"
                                       width="32" 
                                       height="32">
                </div>
                <div class="description">${this.description}</div>
            </div>
            ${this._renderCardLinks()}
        </div>
        `;
    }

    _renderCardLinks(){
        return html`${pages.map(page => html`
                            <qwc-extension-link slot="link"
                                extensionName="${this.name}"
                                iconName="${page.icon}"
                                displayName="${page.title}"
                                staticLabel="${page.staticLabel}"
                                dynamicLabel="${page.dynamicLabel}"
                                streamingLabel="${page.streamingLabel}"
                                path="${page.id}"
                                ?embed=${page.embed}
                                externalUrl="${page.metadata.externalUrl}"
                                webcomponent="${page.componentLink}" >
                            </qwc-extension-link>
                        `)}`;
    }

}
customElements.define('qwc-domino-card', QwcDominoCard);