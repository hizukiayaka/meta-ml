inherit setuptools
require python-tensorflow.inc

RDEPENDS_${PN}_class-target_append = " \
    ${PYTHON_PN}-subprocess \
"
