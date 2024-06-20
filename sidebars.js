/**
 * Creating a sidebar enables you to:
 - create an ordered group of docs
 - render a sidebar for each doc of that group
 - provide next/previous navigation

 The sidebars can be generated from the filesystem, or explicitly defined here.

 Create as many sidebars as you want.
 */

// @ts-check

/** @type {import('@docusaurus/plugin-content-docs').SidebarsConfig} */
const sidebars = {
  // By default, Docusaurus generates a sidebar from the docs folder structure
  /* tutorialSidebar: [{type: 'autogenerated', dirName: '.'}], */

  // But you can create a sidebar manually

  docs: [
    {
      type: 'doc',
      label: 'ScalarDB Community Docs Home',
      id: 'index',
    },
    {
      type: 'category',
      label: 'About ScalarDB',
      collapsible: true,
      items: [
        'overview',
        'design',
        'scalardb-supported-databases',
        'requirements',
      ],
    },
    {
      type: 'category',
      label: 'Getting Started',
      collapsible: true,
      items: [
        {
          type: 'category',
          label: 'ScalarDB',
          collapsible: true,
          items: [
            'getting-started-with-scalardb',
            'getting-started-with-scalardb-by-using-kotlin',
            'scalardb-analytics-postgresql/getting-started',
          ],
        },
      ],
    },
    {
      type: 'category',
      label: 'Samples',
      collapsible: true,
      items: [
        'scalardb-samples/scalardb-sample/README',
        'scalardb-samples/multi-storage-transaction-sample/README',
        'scalardb-samples/microservice-transaction-sample/README',
        'scalardb-samples/scalardb-analytics-postgresql-sample/README',
      ],
    },
    {
      type: 'category',
      label: 'Develop',
      collapsible: true,
      items: [
        {
          type: 'category',
          label: 'Developer Guides',
          collapsible: true,
          items: [
            'api-guide',
          ],
        },
        {
          type: 'category',
          label: 'Configuration Guides',
          collapsible: true,
          items: [
            'configurations',
            'multi-storage-transactions',
            'two-phase-commit-transactions',
          ],
        },
        'data-modeling',
        'add-scalardb-to-your-build',
        'schema-loader',
        'schema-loader-import',
        'scalardb-analytics-postgresql/scalardb-fdw',
        'scalardb-analytics-postgresql/schema-importer',
      ],
    },
    {
      type: 'category',
      label: 'Deploy',
      collapsible: true,
      items: [
        'scalardb-analytics-postgresql/installation',
      ],
    },
    {
      type: 'category',
      label: 'Manage',
      collapsible: true,
      items: [
        'backup-restore',
      ],
    },
    {
      type: 'category',
      label: 'Reference',
      collapsible: true,
      items: [
        'scalardb-benchmarks/README',
        'storage-abstraction',
        'scalardb-core-status-codes',
      ],
    },
    {
      type: 'category',
      label: 'Releases',
      collapsible: true,
      items: [
        'releases/release-notes',
      ],
    },
  ],
};

export default sidebars;
