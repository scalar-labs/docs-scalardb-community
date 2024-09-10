/**
 * Copyright (c) Facebook, Inc. and its affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

/* eslint-disable global-require */

import React from 'react';
import clsx from 'clsx';
import Translate from '@docusaurus/Translate';
import Link from '@docusaurus/Link';

const CardsAbout = [
  {
    // name: '',
    // image: '<LINK_TO>.png',
    url: {
      page: 'overview',
    },
    description: (
      <Translate id="home.about.description">
        Overview
      </Translate>
    ),
  },
  {
    // name: '',
    // image: '<LINK_TO>.png',
    url: {
      page: 'requirements',
    },
    description: (
      <Translate id="home.about.description">
        Requirements
      </Translate>
    ),
  },
]

const CardsGettingStarted = [
  {
    // name: '',
    // image: '<LINK_TO>.png',
    url: {
      page: 'getting-started-with-scalardb',
    },
    description: (
      <Translate id="home.gettingStarted.description">
        Getting started with ScalarDB
      </Translate>
    ),
  },
  {
    // name: '',
    // image: '<LINK_TO>.png',
    url: {
      page: 'scalardb-analytics-postgresql/getting-started',
    },
    description: (
      <Translate id="home.gettingStarted.description">
        Getting started with ScalarDB Analytics with PostgreSQL
      </Translate>
    ),
  },
]

const CardsSamples = [
  {
    // name: '',
    // image: '<LINK_TO>.png',
    url: {
      page: 'scalardb-samples/multi-storage-transaction-sample',
    },
    description: (
      <Translate id="home.samples.description">
        Create a sample application with multi-storage transaction support
      </Translate>
    ),
  },
  {
    // name: '',
    // image: '<LINK_TO>.png',
    url: {
      page: 'scalardb-samples/microservice-transaction-sample',
    },
    description: (
      <Translate id="home.samples.description">
        Create a sample application that supports microservice transactions
      </Translate>
    ),
  },
]

const CardsDevelop = [
  {
    // name: '',
    // image: '<LINK_TO>.png',
    url: {
      page: 'add-scalardb-to-your-build',
    },
    description: (
      <Translate id="home.develop.description">
        Add ScalarDB to your build
      </Translate>
    ),
  },
  {
    // name: '',
    // image: '<LINK_TO>.png',
    url: {
      page: 'schema-loader',
    },
    description: (
      <Translate id="home.develop.description">
        ScalarDB Schema Loader
      </Translate>
    ),
  },
]

const CardsDeploy = [
  {
    // name: '',
    // image: '<LINK_TO>.png',
    url: {
      page: 'scalardb-analytics-postgresql/installation',
    },
    description: (
      <Translate id="home.deploy.description">
        Use Docker to install ScalarDB Analytics with PostgreSQL
      </Translate>
    ),
  },
]

const CardsManage = [
  {
    // name: '',
    // image: '<LINK_TO>.png',
    url: {
      page: 'backup-restore',
    },
    description: (
      <Translate id="home.manage.description">
        Back up and restore databases used through ScalarDB
      </Translate>
    ),
  },
]

const CardsReference = [
  {
    // name: '',
    // image: '<LINK_TO>.png',
    url: {
      page: 'scalardb-benchmarks',
    },
    description: (
      <Translate id="home.reference.description">
        Benchmarking tools
      </Translate>
    ),
  },
  {
    // name: '',
    // image: '<LINK_TO>.png',
    url: {
      page: 'storage-abstraction',
    },
    description: (
      <Translate id="home.reference.description">
        Storage abstraction and API guide
      </Translate>
    ),
  },
];

interface Props {
  // name: string;
  // image: string;
  url: {
    page?: string;
  };
  description: JSX.Element;
}

function Card({ /* name, image,*/ url, description }: Props) {
  return (
    <div className="col col--6 margin-bottom--lg">
      <div className={clsx('card')}>
        <div className={clsx('card__image')}>
          {/* <Link to={url.page}>
            <img src={image}></img>}
          </Link> */}
        </div>
        <Link to={url.page}>
          <div className="card__body">
            {/* <h3>{name}</h3> */}
            <p>{description}</p>
          </div>
        </Link>
        {/* <div className="card__footer">
          <div className="button-group button-group--block">
            <Link className="button button--secondary" to={url.page}>
              <Translate id="button.readMore">Read more</Translate>
            </Link>
          </div>
        </div> */}
      </div>
    </div>
  );
}

export function CardRowAbout(): JSX.Element {
  return (
    <div className="row">
      {CardsAbout.map((special) => (
        <Card key={special.name} {...special} />
      ))}
    </div>
  );
}

export function CardRowGettingStarted(): JSX.Element {
  return (
    <div className="row">
      {CardsGettingStarted.map((special) => (
        <Card key={special.name} {...special} />
      ))}
    </div>
  );
}

export function CardRowSamples(): JSX.Element {
  return (
    <div className="row">
      {CardsSamples.map((special) => (
        <Card key={special.name} {...special} />
      ))}
    </div>
  );
}

export function CardRowDevelop(): JSX.Element {
  return (
    <div className="row">
      {CardsDevelop.map((special) => (
        <Card key={special.name} {...special} />
      ))}
    </div>
  );
}

export function CardRowDeploy(): JSX.Element {
  return (
    <div className="row">
      {CardsDeploy.map((special) => (
        <Card key={special.name} {...special} />
      ))}
    </div>
  );
}

export function CardRowManage(): JSX.Element {
  return (
    <div className="row">
      {CardsManage.map((special) => (
        <Card key={special.name} {...special} />
      ))}
    </div>
  );
}
export function CardRowReference(): JSX.Element {
  return (
    <div className="row">
      {CardsReference.map((special) => (
        <Card key={special.name} {...special} />
      ))}
    </div>
  );
}
