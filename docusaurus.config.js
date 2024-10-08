// @ts-check
// `@type` JSDoc annotations allow editor autocompletion and type checking
// (when paired with `@ts-check`).
// There are various equivalent ways to declare your Docusaurus config.
// See: https://docusaurus.io/docs/api/docusaurus-config

import {themes as prismThemes} from 'prism-react-renderer';

/** @type {import('@docusaurus/types').Config} */
const config = {
  title: 'ScalarDB Community Documentation',
  tagline: 'Cloud-native universal transaction manager',
  favicon: 'img/favicon.ico',

  // Set the production url of your site here
  url: 'https://scalardb-community.scalar-labs.com',
  // Set the /<baseUrl>/ pathname under which your site is served
  // For GitHub pages deployment, it is often '/<projectName>/'
  baseUrl: '/',

  // GitHub pages deployment config.
  // If you aren't using GitHub pages, you don't need these.
  organizationName: 'scalar-labs', // Usually your GitHub org/user name.
  projectName: 'docs-scalardb-community', // Usually your repo name.

  onBrokenLinks: 'warn',
  onBrokenMarkdownLinks: 'warn',

  // Even if you don't use internationalization, you can use this field to set
  // useful metadata like html lang. For example, if your site is Chinese, you
  // may want to replace "en" with "zh-Hans".
  // i18n: {
  //   defaultLocale: 'en-us',
  //   locales: ['en-us', 'ja-jp'],
  //   localeConfigs: {
  //     'en-us': {
  //       label: 'English',
  //       direction: 'ltr',
  //       htmlLang: 'en-US',
  //       calendar: 'gregory',
  //       path: 'versioned_docs/en-us',
  //     },
  //     'ja-jp': {
  //       label: '日本語',
  //       direction: 'ltr',
  //       htmlLang: 'ja-JP',
  //       calendar: 'gregory',
  //       path: 'versioned_docs/ja-jp',
  //     },
  //   },
  // },

  presets: [
    [
      'classic',
      /** @type {import('@docusaurus/preset-classic').Options} */
      ({
        docs: {
          breadcrumbs: true,
          sidebarPath: './sidebars.js',
          // Remove this to remove the "edit this page" links.
          editUrl: 'https://github.com/scalar-labs/docs-scalardb-community/edit/main',
          editLocalizedFiles: true, // This allows for the "Edit this page" button to direct users to edit the localized version of the page on GitHub.
          lastVersion: 'current',
            versions: {
              // The following is a template for adding a new version to the dropdown menu. Copy this version template when adding a new version to the dropdown menu but don't delete it.
              /*
              current: { // When a new version is released and this is no longer the current version, change this to the version number and then delete this comment.
                label: '<VERSION_NUMBER>',
                path: 'latest', // When a new version is released and this is no longer the current version, change this to the version number and then delete this comment.
                banner: 'none',
              },
              */
              current: { // When a new version is released and this is no longer the current version, change this to the version number and then delete this comment.
                label: '3.13',
                path: 'latest', // When a new version is released and this is no longer the current version, change this to the version number and then delete this comment.
                banner: 'none',
              },
              "3.12": {
                label: '3.12',
                path: '3.12',
                banner: 'none',
              },
              "3.11": {
                label: '3.11',
                path: '3.11',
                banner: 'none',
              },
              "3.10": {
                label: '3.10',
                path: '3.10',
                banner: 'none',
              },
              "3.9": {
                label: '3.9',
                path: '3.9',
                banner: 'none',
              },
              "3.8": {
                label: '3.8',
                path: '3.8',
                banner: 'none',
              },
              "3.7": {
                label: '3.7 (unsupported)',
                path: '3.7',
                banner: 'unmaintained',
              },
              "3.6": {
                label: '3.6 (unsupported)',
                path: '3.6',
                banner: 'unmaintained',
              },
              "3.5": {
                label: '3.5 (unsupported)',
                path: '3.5',
                banner: 'unmaintained',
              },
              "3.4": {
                label: '3.4 (unsupported)',
                path: '3.4',
                banner: 'unmaintained',
              },
            },
          },
          googleTagManager: {
            containerId: 'GTM-WL9C9L5',
          },
          gtag: {
            trackingID: 'G-Q4TKS77KCP',
            anonymizeIP: true,
          },
        // Maybe we can use this later.
        /*
        blog: {
          showReadingTime: true,
        },
        */
        theme: {
          customCss: './src/css/custom.css',
        },
      }),
    ],
  ],
  scripts: [
    '/redirect.js', // Path to your custom JavaScript file
  ],

  plugins: [
    [
      '@docusaurus/plugin-client-redirects',
      {
        redirects: [
          // This redirect takes the user to the latest version of the English docs when they land on the English versions of the docs site.
          {
            to: 'https://scalardb.scalar-labs.com/docs/latest/',
            from: ['/', '/docs'],
          },
        ],
      },
    ],
    require.resolve('docusaurus-plugin-image-zoom'),
    // [
    //   require.resolve("docusaurus-lunr-search"),
    //   {
    //     enableHighlight: true,
    //     includeRoutes: ['/docs/latest/**'],
    //   },
    // ],
  ],
  markdown: {
    mermaid: true,
  },
  themes: ['@docusaurus/theme-mermaid'],

  themeConfig:
    /** @type {import('@docusaurus/preset-classic').ThemeConfig} */
    ({
      docs: {
        sidebar: {
          hideable: true,
        },
      },
      // Replace with your project's social card
      image: 'img/scalardb-logo.png',
      navbar: {
        title: 'Community Edition',
        logo: {
          alt: 'ScalarDB logo',
          src: 'img/scalardb-logo.png',
          href: '/docs/latest/',
          target: '_self',
        },
        items: [
          {
            type: 'docsVersionDropdown',
            position: 'left',
            dropdownActiveClassDisabled: true,
          },
          {
            type: 'html',
            position: 'right',
            value: '<div id="google_translate_element"></div>',
          },
          {
            href: 'https://developers.scalar-labs.com/docs/',
            position: 'right',
            label: 'Scalar Docs Home',
          },
          {
            href: 'https://github.com/scalar-labs/scalardb',
            position: 'right',
            className: 'header-github-link',
            'aria-label': 'GitHub repository',
          },
          /*
          The "localeDropdown" configuration should be uncommented (enabled) after we create Japanese versions of docs.
          */
          // {
          //   type: 'localeDropdown',
          //   position: 'right',
          // },
        ],
      },
      algolia: {
        // The application ID provided by Algolia
        appId: 'GCH733E3CR',

        // Public API key: it is safe to commit it
        apiKey: 'da6d138b28bb91ac7859546bb3bfd4fd',

        indexName: 'scalardb-community-scalar-labs',

        // Optional: see doc section below
        contextualSearch: true,

        // Optional: Specify domains where the navigation should occur through window.location instead on history.push. Useful when our Algolia config crawls multiple documentation sites and we want to navigate with window.location.href to them.
        // externalUrlRegex: 'external\\.com|domain\\.com',

        // Optional: Replace parts of the item URLs from Algolia. Useful when using the same search index for multiple deployments using a different baseUrl. You can use regexp or string in the `from` param. For example: localhost:3000 vs myCompany.com/docs
        // replaceSearchResultPathname: {
        //   from: '/docs/', // or as RegExp: /\/docs\//
        //   to: '/',
        // },

        // Optional: Algolia search parameters
        // searchParameters: {},

        // Optional: path for search page that enabled by default (`false` to disable it)
        searchPagePath: 'search',

        //... other Algolia params
      },
      footer: {
        style: 'dark',
        links: [
          {
            title: 'Products',
            items: [
              {
                label: 'ScalarDB',
                href: 'https://www.scalar-labs.com/scalardb',
              },
              {
                label: 'ScalarDL',
                href: 'https://www.scalar-labs.com/scalardl',
              },
            ],
          },
          {
            title: 'Company',
            items: [
              {
                label: 'About us',
                href: 'https://www.scalar-labs.com/about-us',
              },
              {
                label: 'News',
                href: 'https://www.scalar-labs.com/news',
              },
              {
                label: 'Scalar Engineering Blog',
                href: 'https://medium.com/scalar-engineering',
              },
            ],
          },
          {
            title: 'Community',
            items: [
              {
                label: 'GitHub',
                href: 'https://github.com/scalar-labs',
              },
              {
                label: 'LinkedIn',
                href: 'https://www.linkedin.com/company/scalarlabs',
              },
              {
                label: 'YouTube',
                href: 'https://www.youtube.com/@scalar-labs',
              },
              {
                label: 'Twitter',
                href: 'https://twitter.com/scalar_labs',
              },
            ],
          },
          {
            title: 'More',
            items: [
              {
                label: 'Pricing',
                href: 'https://www.scalar-labs.com/pricing',
              },
              {
                label: 'Docs',
                href: 'https://developers.scalar-labs.com/docs',
              },
              {
                label: 'Support',
                href: 'https://www.scalar-labs.com/support',
              },
              {
                label: 'Contact us',
                href: 'https://www.scalar-labs.com/contact',
              },
            ],
          },
        ],
        copyright: `Copyright © ${new Date().getFullYear()} Scalar, Inc.`,
      },
      mermaid: {
        theme: {
          light: 'base',
          dark: 'base',
        },
        options: {
          themeVariables: {
            primaryColor: '#D5EAFF',
            primaryTextColor: '#3D4144',
            primaryBorderColor: '#2673BB',
            lineColor: '#3D4144',
            secondaryColor: '#D5EAFF',
            tertiaryColor: '#D5EAFF',
          },
        },
      },
      prism: {
        theme: prismThemes.github,
        darkTheme: prismThemes.dracula,
      },
      announcementBar: {
        id: 'new_version',
        content:
          '<b>Important: The ScalarDB Community docs site has been merged with the <a target="_self" rel="noopener noreferrer" href="https://scalardb.scalar-labs.com/docs/latest/">ScalarDB docs site</a>.</b>',
        backgroundColor: '#e00000',
        textColor: '#ffffff',
        isCloseable: false,
      },
      zoom: {
        selector: '.markdown :not(em) > img',
        background: {
          light: 'rgb(255, 255, 255)',
          dark: 'rgb(50, 50, 50)'
        },
        config: {
          // options you can specify via https://github.com/francoischalifour/medium-zoom#usage
        }
      },
    }),
};

export default config;
