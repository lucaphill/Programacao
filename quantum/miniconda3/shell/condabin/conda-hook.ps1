$Env:CONDA_EXE = "/home/luca/Documentos/code/quantum/miniconda3/bin/conda"
$Env:_CONDA_EXE = "/home/luca/Documentos/code/quantum/miniconda3/bin/conda"
$Env:_CE_M = $null
$Env:_CE_CONDA = $null
$Env:CONDA_PYTHON_EXE = "/home/luca/Documentos/code/quantum/miniconda3/bin/python"
$Env:_CONDA_ROOT = "/home/luca/Documentos/code/quantum/miniconda3"
$CondaModuleArgs = @{ChangePs1 = $True}

Import-Module "$Env:_CONDA_ROOT\shell\condabin\Conda.psm1" -ArgumentList $CondaModuleArgs

Remove-Variable CondaModuleArgs