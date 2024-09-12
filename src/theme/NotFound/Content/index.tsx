import React from 'react';
import clsx from 'clsx';
import Translate from '@docusaurus/Translate';
import type {Props} from '@theme/NotFound/Content';
import Heading from '@theme/Heading';
import Link from '@docusaurus/Link';

export default function NotFoundContent({className}: Props): JSX.Element {
  // Automatically redirect visitors to the ScalarDB docs site after a 10-second wait.
  setTimeout(function() {
    window.location.replace('https://scalardb.scalar-labs.com/docs/latest/');
  }, 10000);

  return (
    <main className={clsx('container margin-vert--xl', className)}>
      <div className="row">
        <div className="col col--6 col--offset-3">
          <Heading as="h1" className="hero__title">
            <Translate
              id="theme.NotFound.title"
              description="The title of the 404 page">
              The contents of this site have moved.
            </Translate>
          </Heading>
          <p>
            <Translate
              id="theme.NotFound.p1"
              description="The first paragraph of the 404 page">
              The ScalarDB Community docs site has been merged with the&nbsp;
            </Translate>
            <Link
              to="https://scalardb.scalar-labs.com/docs/latest/">
                ScalarDB docs site
            </Link>.
          </p>
          <p>
            <Translate
              id="theme.NotFound.p2"
              description="The 2nd paragraph of the 404 page">
              You will be redirected shortly.
            </Translate>
          </p>
        </div>
      </div>
    </main>
  );
}
